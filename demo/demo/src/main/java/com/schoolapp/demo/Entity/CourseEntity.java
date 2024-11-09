package com.schoolapp.demo.Entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "course")
public class CourseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "course_name")
    private String courseName;

    private String description;
    private Integer credits;

    @ManyToOne
    @JoinColumn(name = "teacher_id", nullable = false)
    private TeacherEntity teacherEntity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    public TeacherEntity getTeacher() {
        return teacherEntity;
    }

    public void setTeacher(TeacherEntity teacherEntity) {
        this.teacherEntity = teacherEntity;
    }
}
