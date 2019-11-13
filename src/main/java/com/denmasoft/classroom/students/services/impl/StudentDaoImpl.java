package com.denmasoft.classroom.students.services.impl;

import com.denmasoft.classroom.students.models.Student;
import com.denmasoft.classroom.students.repositories.StudentRepository;
import com.denmasoft.classroom.students.services.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentDaoImpl implements StudentDao {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student> getAll() {
       return studentRepository.findAll();
    }
}
