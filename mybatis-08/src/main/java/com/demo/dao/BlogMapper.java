package com.demo.dao;

import com.demo.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    int add(Blog blog);

    List<Blog> BlogIF(Map map);
}
