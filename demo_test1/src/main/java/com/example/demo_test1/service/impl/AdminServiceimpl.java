package com.example.demo_test1.service.impl;


import com.example.demo_test1.dao.AdminDao;
import com.example.demo_test1.model.Admin;
import com.example.demo_test1.service.AdminService;
import org.springframework.stereotype.Service;
import sun.security.provider.SHA;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class AdminServiceimpl implements AdminService {
    @Resource
    private AdminDao adminDao;


    public Admin login(String username, String password){
        //将密码加密后再进行比对
        /*if (password.length()!=32){
            password= SHA.getResult(password);
        }*/
        Admin admin=adminDao.login(username, password);
        return admin;
    }

}
