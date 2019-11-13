package com.denmasoft.classroom.subjects.services;

import com.denmasoft.classroom.subjects.models.Subject;

import java.util.List;

public interface SubjectDao {
    List<Subject> getAll();
}
