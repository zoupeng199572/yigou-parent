package cn.itsource.yigou.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("employee")
public class Employee {

    @TableId(value = "id",type = IdType.AUTO)
    private Long id;
    private String username;
    private String password;
    private String email;
    private Integer age;
}
