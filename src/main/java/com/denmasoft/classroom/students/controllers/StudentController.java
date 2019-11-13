package com.denmasoft.classroom.students.controllers;

import com.denmasoft.classroom.students.models.Student;
import com.denmasoft.classroom.students.services.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import static com.denmasoft.classroom.constantsApi.STUDENTS_ROUTE;

@RestController()
@CrossOrigin(origins = "*")
@RequestMapping(STUDENTS_ROUTE)
public class StudentController {

    @Autowired
    private StudentDao studentDao;

    @GetMapping("/")
    public ResponseEntity<Object> getAll ()
    {
        List<Student> students = studentDao.getAll ();
        return ResponseEntity.ok (students);
    }
}
