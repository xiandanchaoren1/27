package com.chen.mapper;

import com.chen.po.Student;import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface StudentMapper   {
    List<Student> findAllByColumnLike(@Param("map")Map<String, Object> map);
}
