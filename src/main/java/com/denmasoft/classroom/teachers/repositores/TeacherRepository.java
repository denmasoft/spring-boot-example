package com.denmasoft.classroom.teachers.repositores;

import com.denmasoft.classroom.teachers.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
