package com.demo.dao;

import com.demo.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface TeacherMapper {
    @Select("select * from teacher where id = #{tid}")
    Teacher get(@Param("tid")int id);
}
