package com.example.demo_test1.dao;

import com.example.demo_test1.DemoTest1ApplicationTests;
import org.junit.Test;
import com.example.demo_test1.model.Admin;
import javax.annotation.Resource;


public class AdminDaoTest extends DemoTest1ApplicationTests {
    @Resource
    private AdminDao adminDao;

    @Test
    public void testLogin(){
        Admin admin=adminDao.login("user","123456");
        System.out.println(admin);

    }
}
