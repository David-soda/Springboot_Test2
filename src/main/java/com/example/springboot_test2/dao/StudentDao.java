package com.example.springboot_test2.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboot_test2.domain.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentDao extends BaseMapper<Student> {
}
