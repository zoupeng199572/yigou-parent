package cn.itsource.yigou.service;

import cn.itsource.yigou.domain.Employee;
import com.baomidou.mybatisplus.extension.service.IService;

public interface IEmployeeService extends IService<Employee> {
    Employee login(String username, String password);
}
