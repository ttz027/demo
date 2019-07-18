package com.example.demo.service.impl;

import com.example.demo.dao.school.StudentMapper;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;
    @Override
    public List<Student> findAll() {
        return studentMapper.findAll();
    }

    @Override
    @Transactional(transactionManager = "slaverTransactionManager")
    public int addStudent(Student student) {
       /* for (int i=0;i<3;i++){
            student.setUsername(student.getUsername()+i);
            studentMapper.addStudent(student);
            if(i==2){
                throw new RuntimeException("test");
            }
        }*/
        return studentMapper.addStudent(student);
    }
}
