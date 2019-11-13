package com.denmasoft.classroom.subjects.controllers;

import com.denmasoft.classroom.subjects.models.Subject;
import com.denmasoft.classroom.subjects.services.SubjectDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.denmasoft.classroom.constantsApi.SUBJECT_ROUTE;

@RestController()
@CrossOrigin(origins = "*")
@RequestMapping(SUBJECT_ROUTE)
public class SubjectController {

    @Autowired
    private SubjectDao subjectDao;

    @GetMapping("/")
    public ResponseEntity<Object> getAll ()
    {
        List<Subject> subjects = subjectDao.getAll ();
        return ResponseEntity.ok (subjects);
    }
}