package cn.itsource.yigou.service.impl;

import cn.itsource.yigou.domain.Employee;
import cn.itsource.yigou.mapper.EmployeeMapper;
import cn.itsource.yigou.service.IEmployeeService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper,Employee> implements IEmployeeService{

    @Override
    public Employee login(String username, String password) {
        //创键一个条件构造器
        QueryWrapper<Employee> queryWrapper = new QueryWrapper<>();
        //构造一个username和password跟前台登录时传入的username和password相同的条件
        queryWrapper.eq("username", username).eq("password",password );
        return baseMapper.selectOne(queryWrapper);
    }
}
