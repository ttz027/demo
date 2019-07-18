package com.example.demo.dao.school;

import com.example.demo.entity.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentMapper {

    @Select("select *from student")
    List<Student> findAll();


    @Insert("insert into student(username,password,age) value(#{username},#{password},#{age})")
    int addStudent(Student student);
}
