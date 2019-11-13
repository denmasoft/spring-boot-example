package com.denmasoft.classroom.teachers.services.impl;

import com.denmasoft.classroom.teachers.models.Teacher;
import com.denmasoft.classroom.teachers.repositores.TeacherRepository;
import com.denmasoft.classroom.teachers.services.TeacherDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherDaoImpl implements TeacherDao {

    @Autowired
    TeacherRepository teacherRepository;
    @Override
    public List<Teacher> getAll() {
        return teacherRepository.findAll();
    }
}
