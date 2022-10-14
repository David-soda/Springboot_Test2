package com.example.springboot_test2;

import com.example.springboot_test2.dao.StudentDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootTest2ApplicationTests {

    @Autowired
    private StudentDao studentDao;

    @Test
    void contextLoads() {
        System.out.println(studentDao.selectById(1));
    }

}
