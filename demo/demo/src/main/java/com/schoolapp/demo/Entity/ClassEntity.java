package com.schoolapp.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "class")
public class ClassEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @Column(name = "grade_level")
    private String gradeLevel;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private TeacherEntity teacherEntity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public TeacherEntity getTeacher() {
        return teacherEntity;
    }

    public void setTeacher(TeacherEntity teacherEntity) {
        this.teacherEntity = teacherEntity;
    }
}
