package com.example.springboot_test2.service.Impl;

import com.example.springboot_test2.dao.StudentDao;
import com.example.springboot_test2.domain.Student;
import com.example.springboot_test2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentSeviceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public Student getByID(Integer id) {
        return studentDao.selectById(id);
    }

    @Override
    public List<Student> getAll() {
        return studentDao.selectList(null);
    }

    @Override
    public Boolean save(Student student) {
        return studentDao.insert(student) > 0 ;
    }

    @Override
    public Boolean update(Student student) {
        return studentDao.updateById(student) > 0 ;
    }

    @Override
    public Boolean delete(Integer id) {
        return studentDao.deleteById(id) > 0 ;
    }
}
