package cn.itsource.yigou.controller;

import cn.itsource.aigou.utils.AjaxResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class LoginController {

    @PostMapping("/login")
    /**
     * 前台使用ajax请求传入josn字符串   @RequestBody接收前台传入的josn数据
     */
    public AjaxResult login(@RequestBody Map<String,Object> params){
        String username = (String) params.get("username");
        String password = (String) params.get("password");
        if ("zp".equals(username) && "123".equals(password)){//如果用户名和密码都能匹配就成功
            return AjaxResult.me();
        }else {
            return AjaxResult.me().setSuccess(false).setMessage("用户名或者密码错误请重试");
        }
    }
}
