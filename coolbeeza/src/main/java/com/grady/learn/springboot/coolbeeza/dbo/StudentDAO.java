package com.grady.learn.springboot.coolbeeza.dbo;

import java.util.List;

import com.grady.learn.springboot.coolbeeza.entity.Student;

public interface StudentDAO {
    
    void save(Student student);

    Student findById(Integer id);

    List<Student> findAll();
}
