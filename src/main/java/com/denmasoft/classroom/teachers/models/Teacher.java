package com.denmasoft.classroom.teachers.models;

import com.denmasoft.classroom.subjects.models.Subject;

import javax.persistence.*;
import java.util.List;

@Entity(name = "teacher")
public class Teacher implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column
    private Long id;
    @Column
    private String name;
    @Column
    private String dni;
    @OneToMany (cascade = CascadeType.REMOVE, mappedBy = "teacher", orphanRemoval = true)
    private List<Subject> subjects;

    public Teacher(){}

    public Teacher(Long id)
    {
        super ();
        this.id = id;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public String getDni() {
        return dni;
    }
}
