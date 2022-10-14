package com.example.springboot_test2.controller;

import com.example.springboot_test2.controller.utils.R;
import com.example.springboot_test2.domain.Student;
import com.example.springboot_test2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.io.IOException;


@RestController
@CrossOrigin
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("{id}")
    public R getById(@PathVariable Integer id) {
        return new R(true, studentService.getByID(id));
    }

    @GetMapping
    public R getAll() {
        return new R(true, studentService.getAll());
    }

    @PostMapping
    public R save(@RequestBody Student student) throws IOException {
//        if (student.getName().equals("123") ) throw new IOException();
        boolean flag = studentService.save(student);
        return new R(flag, flag ? "添加成功^_^" : "添加失败-_-!");
    }

    @PutMapping
    public R update(@RequestBody Student student) throws IOException {
//        if (student.getName().equals("123") ) throw new IOException();
        boolean flag = studentService.update(student);
        return new R(flag, flag ? "修改成功^_^" : "修改失败-_-!");
    }

    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id) {
        return new R(studentService.delete(id));
    }
}
