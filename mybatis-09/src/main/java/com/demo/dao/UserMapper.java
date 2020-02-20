package com.demo.dao;

import com.demo.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    User getId(@Param("id") int id);
}
