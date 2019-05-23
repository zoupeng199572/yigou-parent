package cn.itsource.yigou.controller;

import cn.itsource.aigou.utils.AjaxResult;
import cn.itsource.yigou.util.FastDfsApiOpr;
import org.apache.commons.io.FilenameUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
@RestController
public class FileController {

    /**
     * 文件的上传
     * @param file
     * @return
     */
    @PostMapping("/file/upload")
    public AjaxResult uploadFile(@RequestParam("file") MultipartFile file){
        try {
            //获取到文件后缀
            String extension = FilenameUtils.getExtension(file.getOriginalFilename());
            //调用方法传入文件名的字节数组和文件后缀
            String fileId = FastDfsApiOpr.upload(file.getBytes(), extension);
            //上传成功
            return AjaxResult.me().setData(fileId);
        } catch (IOException e) {
            e.printStackTrace();
            //上传失败
            return AjaxResult.me().setSuccess(false).setMessage("上传失败!");
        }
    }
    /**
     * 删除分布式文件系统中的文件
     * @param fileId
     * @return
     */
    @GetMapping("/file/delete")
    public AjaxResult deleteFile(@RequestParam("fileId") String fileId){
        try {
            //fileId=/group1/M00/00/01/wKgAblzh-gCANGDFAAFiI8sLJSc906_big.png
            //参数需要组名和文件名
            String tempFile= fileId.substring(1);
            String group = tempFile.substring(0, tempFile.indexOf("/"));
            String name = tempFile.substring(tempFile.indexOf("/")+1);
            FastDfsApiOpr.delete(group, name);
            return AjaxResult.me();
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.me().setSuccess(false).setMessage("删除失败!");
        }
    }
}
