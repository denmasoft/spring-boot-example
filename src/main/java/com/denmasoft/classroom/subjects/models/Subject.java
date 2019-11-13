package com.denmasoft.classroom.subjects.models;

import com.denmasoft.classroom.students.models.Student;
import com.denmasoft.classroom.teachers.models.Teacher;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;
@Entity(name = "subject")
public class Subject implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column
    private Long id;
    @Column
    private String name;
    @JoinColumn (name = "teacher", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    @ManyToOne (optional = false)
    @JsonIgnore
    private Teacher teacher;

    @ManyToMany(mappedBy = "subjects")
    @JsonIgnore
    private List<Student> students;

    Subject(){
        super();
    }
    Subject(Long id){
        super();
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public Teacher getTeacher() {
        return teacher;
    }
}
