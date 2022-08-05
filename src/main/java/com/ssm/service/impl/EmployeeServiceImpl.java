package com.ssm.service.impl;

import com.ssm.entity.Employee;
import com.ssm.mapper.EmployeeMapper;
import com.ssm.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author gwoksing
 * @date 2022/8/4 14:52
 */
@Service
public class EmployeeServiceImpl implements IEmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    /**
     * 查询所有
     *
     * @return
     */
    @Override
    public List<Employee> selectEmployeeList() {
        return employeeMapper.selectEmployeeList();
    }
}
