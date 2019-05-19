package cn.itsource.yigou.controller;

import cn.itsource.aigou.utils.AjaxResult;
import cn.itsource.yigou.domain.Employee;
import cn.itsource.yigou.service.IEmployeeService;
import cn.itsource.yigou.service.impl.EmployeeServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
//@CrossOrigin  //解决跨域问题,这样配置所有的请求都可以访问
public class LoginController {
    @Autowired
    private IEmployeeService employeeService;

    @PostMapping("/login")
    @ApiOperation(value = "登录接口")//此注解用于描述接口名称
    /**
     * 前台使用ajax请求传入josn字符串   @RequestBody接收前台传入的josn数据
     */
    public AjaxResult login(@RequestBody Map<String,Object> params){
        String username = (String) params.get("username");
        String password = (String) params.get("password");
        Employee employee = employeeService.login(username,password);
        System.out.println(employee);
        if(null != employee){
            return AjaxResult.me();
        }else {
            return AjaxResult.me().setSuccess(false).setMessage("用户名或者密码错误请重试");
        }

    }
}
