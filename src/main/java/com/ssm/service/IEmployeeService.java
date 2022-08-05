package com.ssm.service;

import com.ssm.entity.Employee;

import java.util.List;

/**
 * @author gwoksing
 * @date 2022/8/4 14:51
 */
public interface IEmployeeService {
    /**
     * 查询所有
     *
     * @return
     */
    List<Employee> selectEmployeeList();
}
