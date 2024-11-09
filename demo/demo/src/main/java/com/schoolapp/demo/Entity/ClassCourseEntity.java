package com.schoolapp.demo.Entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "class_course")
public class ClassCourseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; // Surrogate key to simplify the entity

    @ManyToOne
    @JoinColumn(name = "class_id", nullable = false)
    private ClassEntity classEntity;

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private CourseEntity courseEntity;

    // Default constructor
    public ClassCourseEntity() {}

    // Constructor
    public ClassCourseEntity(ClassEntity classEntity, CourseEntity courseEntity) {
        this.classEntity = classEntity;
        this.courseEntity = courseEntity;
    }

    // Getters and Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ClassEntity getClassEntity() {
        return classEntity;
    }

    public void setClassEntity(ClassEntity classEntity) {
        this.classEntity = classEntity;
    }

    public CourseEntity getCourseEntity() {
        return courseEntity;
    }

    public void setCourseEntity(CourseEntity courseEntity) {
        this.courseEntity = courseEntity;
    }
}
