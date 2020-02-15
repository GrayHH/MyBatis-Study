package com.demo.dao;

import com.demo.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    @Select("select * from demo.user where name like \"%\"#{value}\"%\"")
    List<User> getUserLike(String name);

    @Select("select * from demo.user")
    List<User> getUserList();

    @Select("select * from demo.user where id = #{id}")
    User getUserById(int id);

    @Insert("insert into demo.user (id, name, pwd) values (#{id},#{name},#{pwd});")
    int addUser(User user);

    @Update("update demo.user set name=#{name},pwd=#{pwd} where id = #{id}")
    int updataUser(User user);

    @Delete("delete from demo.user where id = #{id};")
    int deleteUser(int id);

    @Select("select * from demo.user limit #{startIndex},#{pageSize}")
    List<User> getUserByLimit(Map<String,Integer> map);
}
