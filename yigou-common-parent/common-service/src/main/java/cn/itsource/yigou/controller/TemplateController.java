package cn.itsource.yigou.controller;

import cn.itsource.yigou.util.VelocityUtils;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class TemplateController {

    @PostMapping("/page")
    public void createStaticPage(@RequestBody Map<String,Object> params){
        Object model = params.get("model");
        String templatePath = (String) params.get("templatePath");
        String targetPath = (String) params.get("targetPath");

        VelocityUtils.staticByTemplate(model,templatePath,targetPath);
    }

}
