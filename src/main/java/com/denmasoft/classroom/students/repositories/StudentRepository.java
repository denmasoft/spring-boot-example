package com.denmasoft.classroom.students.repositories;

import com.denmasoft.classroom.students.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>
{

}
