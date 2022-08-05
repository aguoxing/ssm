package com.ssm.mapper;

import com.ssm.entity.Employee;

import java.util.List;

/**
 * @author gwoksing
 * @date 2022/8/4 14:51
 */
public interface EmployeeMapper {
    /**
     * 查询所有
     *
     * @return
     */
    List<Employee> selectEmployeeList();
}
