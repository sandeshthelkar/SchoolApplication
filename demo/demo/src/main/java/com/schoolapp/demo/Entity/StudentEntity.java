package com.schoolapp.demo.Entity;

import jakarta.persistence.*;

import java.io.Serializable;


@Entity
@Table(name = "student")
public class StudentEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    private Integer age;
    private String grade;
    private String address;

    @Column(unique = true)
    private String email;

    private String parent_contact;

    @ManyToOne
    @JoinColumn(name = "class_id")
    private ClassEntity aClassEntity;

    // Getters and setters


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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getParent_contact() {
        return parent_contact;
    }

    public void setParent_contact(String parent_contact) {
        this.parent_contact = parent_contact;
    }

    public ClassEntity getaClass() {
        return aClassEntity;
    }

    public void setaClass(ClassEntity aClassEntity) {
        this.aClassEntity = aClassEntity;
    }
}
