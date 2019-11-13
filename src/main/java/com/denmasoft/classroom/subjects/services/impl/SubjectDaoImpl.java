package com.denmasoft.classroom.subjects.services.impl;

import com.denmasoft.classroom.subjects.models.Subject;
import com.denmasoft.classroom.subjects.repositories.SubjectRepository;
import com.denmasoft.classroom.subjects.services.SubjectDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectDaoImpl implements SubjectDao {

    @Autowired
    SubjectRepository subjectRepository;

    @Override
    public List<Subject> getAll() {
        return subjectRepository.findAll();
    }
}
