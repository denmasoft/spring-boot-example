package com.denmasoft.classroom.subjects.repositories;

import com.denmasoft.classroom.subjects.models.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
}