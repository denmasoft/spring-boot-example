package com.denmasoft.classroom.teachers.controllers;

import com.denmasoft.classroom.teachers.models.Teacher;
import com.denmasoft.classroom.teachers.services.TeacherDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.denmasoft.classroom.constantsApi.TEACHER_ROUTE;

@RestController()
@CrossOrigin(origins = "*")
@RequestMapping(TEACHER_ROUTE)
public class TeacherController {

    @Autowired
    private TeacherDao teacherDao;

    @GetMapping("/")
    public ResponseEntity<Object> getAll ()
    {
        List<Teacher> teachers = teacherDao.getAll ();
        return ResponseEntity.ok (teachers);
    }
}
