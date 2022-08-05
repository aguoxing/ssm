package com.ssm.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * @author gwoksing
 * @date 2022/8/4 14:48
 */
@Data
@ToString
public class Employee {
    private String id;
    private String username;
    private String age;
    private String sex;
    private String phoneNumber;
    private String email;
    private Date createTime;
}
