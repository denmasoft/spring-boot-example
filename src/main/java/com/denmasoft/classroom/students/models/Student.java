package com.denmasoft.classroom.students.models;

import com.denmasoft.classroom.subjects.models.Subject;

import javax.persistence.*;
import java.util.List;

@Entity(name = "student")
public class Student implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column
    private Long id;
    @Column
    private String name;
    @Column
    private String sex;
    @Column
    private Integer age;
    @ManyToMany
    @JoinTable(
            name = "student_subjects",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "subject_id"))
    List<Subject> subjects;

    public Student ()
    {
        super ();
    }

    public Student (Long id)
    {
        super ();
        this.id = id;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public Integer getAge() {
        return age;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }
}
