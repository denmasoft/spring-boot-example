package com.denmasoft.classroom.teachers.services;

import com.denmasoft.classroom.teachers.models.Teacher;

import java.util.List;

public interface TeacherDao {

    List<Teacher> getAll();
}
