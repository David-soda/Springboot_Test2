package com.example.springboot_test2.service;

import com.example.springboot_test2.domain.Student;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StudentService {
    Student getByID(Integer id);

    List<Student> getAll();

    Boolean save(Student student);

    Boolean update(Student student);

    Boolean delete(Integer id);
}
