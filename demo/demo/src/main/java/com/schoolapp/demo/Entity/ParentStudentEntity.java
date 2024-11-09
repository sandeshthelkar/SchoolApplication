package com.schoolapp.demo.Entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "parent_student")
public class ParentStudentEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; // Surrogate key to simplify the entity

    @ManyToOne
    @JoinColumn(name = "parent_id", nullable = false)
    private ParentEntity parentEntity;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private StudentEntity studentEntity;

    // Default constructor
    public ParentStudentEntity() {}

    public ParentStudentEntity(Integer id, ParentEntity parentEntity, StudentEntity studentEntity) {
        this.id = id;
        this.parentEntity = parentEntity;
        this.studentEntity = studentEntity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ParentEntity getParentEntity() {
        return parentEntity;
    }

    public void setParentEntity(ParentEntity parentEntity) {
        this.parentEntity = parentEntity;
    }

    public StudentEntity getStudentEntity() {
        return studentEntity;
    }

    public void setStudentEntity(StudentEntity studentEntity) {
        this.studentEntity = studentEntity;
    }
}
