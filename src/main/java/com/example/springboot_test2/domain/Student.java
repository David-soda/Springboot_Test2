package com.example.springboot_test2.domain;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Student {
    private Integer id;
    private String name;
    private String pwd;
    private String sex;
    private Timestamp birthday;
    private String address;
    private String email;
}
