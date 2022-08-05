package com.ssm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssm.entity.Employee;
import com.ssm.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author gwoksing
 * @date 2022/8/4 13:49
 */
@Controller
public class EmployeeController {
    @Autowired
    private IEmployeeService employeeService;

    @GetMapping("/index")
    public String index() {
        return "index.html";
    }

    @GetMapping("/employee/list")
    public String getEmployeePage(
            @RequestParam(value = "pageNum", required = false, defaultValue = "1") Integer pageNum,
            @RequestParam(value = "pageSize", required = false, defaultValue = "10") Integer pageSize,
            Model model
    ) {
        //开启分页功能
        PageHelper.startPage(pageNum, pageSize);
        //获取员工的分页信息
        PageInfo<Employee> page = new PageInfo<>(employeeService.selectEmployeeList(), 5);
        //将分页数据共享到请求域中
        model.addAttribute("page", page);
        //跳转到employee_list.html
        return "employee";
    }

}
