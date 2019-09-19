package com.example.demo_test1.web;


import com.example.demo_test1.model.Admin;
import com.example.demo_test1.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

//表示所有的请求都是@ResponseBody
@RestController
@RequestMapping(value = "/api/login")
public class LoginController {

    @Resource
    private AdminService adminService;

    @GetMapping
    public Map<String,Object> Login(String username, String password, HttpSession session){
        Map<String,Object> map=new HashMap<String,Object>();
       Admin admin=adminService.login(username,password);
        if(admin!=null){
            session.setAttribute("admin", admin);
            map.put("status",1);
        }else{
            map.put("status",0);
            map.put("myMessage", "登录失败:密码错误！！！！");
        }
        return map;
    }
}
