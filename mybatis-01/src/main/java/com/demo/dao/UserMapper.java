package com.demo.dao;

import com.demo.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    @Select("select * from user where name like \"%\"#{value}\"%\"")
    List<User> getUserLike(String name);

    @Select("select * from user")
    List<User> getUserList();

    @Select("select * from user where id = #{id}")
    User getUserById(@Param("id")int id);

    @Insert("insert into user (id, name, pwd) values (#{id},#{name},#{pwd});")
    int addUser(User user);

    @Update("update user set name=#{name},pwd=#{pwd} where id = #{id}")
    int updataUser(User user);

    @Delete("delete from user where id = #{id};")
    int deleteUser(@Param("id") int id);

    @Select("select * from demo.user limit #{startIndex},#{pageSize}")
    List<User> getUserByLimit(Map<String,Integer> map);
}
