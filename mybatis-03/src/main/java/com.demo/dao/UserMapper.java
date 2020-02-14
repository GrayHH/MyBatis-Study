package com.demo.dao;

import com.demo.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> getUserLike(String name);
    //获取全部用户
    List<User> getUserList();
    //根据ID查询
    User getUserById(int id);
    //增加
    int addUser(User user);
    //修改
    int updataUser(User user);
    //删除
    int deleteUser(int id);
}
