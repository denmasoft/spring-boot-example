package com.denmasoft.classroom.students.services;

import com.denmasoft.classroom.students.models.Student;

import java.util.List;

public interface StudentDao {
    List<Student> getAll();
}
