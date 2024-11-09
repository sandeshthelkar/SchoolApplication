package com.schoolapp.demo.Entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "student_course")
public class StudentCourseEntity implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; // Surrogate key to simplify the entity

    @ManyToOne
    @JoinColumn(name = "student_id",nullable = false)
    private StudentEntity studentEntity;

    @ManyToOne
    @JoinColumn(name = "teacher_id",nullable = false)
    private TeacherEntity teacherEntity;

    public StudentCourseEntity() {
    }

    public StudentCourseEntity(Integer id, StudentEntity studentEntity, TeacherEntity teacherEntity) {
        this.id = id;
        this.studentEntity = studentEntity;
        this.teacherEntity = teacherEntity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public StudentEntity getStudentEntity() {
        return studentEntity;
    }

    public void setStudentEntity(StudentEntity studentEntity) {
        this.studentEntity = studentEntity;
    }

    public TeacherEntity getTeacherEntity() {
        return teacherEntity;
    }

    public void setTeacherEntity(TeacherEntity teacherEntity) {
        this.teacherEntity = teacherEntity;
    }
}
