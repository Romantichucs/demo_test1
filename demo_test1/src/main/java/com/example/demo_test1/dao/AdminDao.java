package com.example.demo_test1.dao;

import com.example.demo_test1.model.Admin;
import org.apache.ibatis.annotations.Param;

public interface AdminDao {
    /**
     * 根据账户名和密码去数据库查询
     * @param username 账户名
     * @param password 密码
     * @return null表示没有找到记录
     */
    Admin login(@Param(value = "username") String username, @Param(value = "password") String password);
}
