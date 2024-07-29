package com.grady.learn.springboot.coolbeeza.dbo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.grady.learn.springboot.coolbeeza.entity.Student;

import jakarta.persistence.EntityManager;

@Repository
public class StudentDAOImpl implements StudentDAO {

    // define fields for the entity manager
    private EntityManager entityManager;

    // inject the entity manager using constructor injection
    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    // implement the method for saving a student
    @Override
    @Transactional
    public void saveStudent(Student student) {
        entityManager.persist(student);
    }

}
