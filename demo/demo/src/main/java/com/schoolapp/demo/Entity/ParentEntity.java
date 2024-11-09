package com.schoolapp.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "parent")
public class ParentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(unique = true)
    private String email;

    private String phone;

    @Column(name = "relationship_to_student")
    private String relationToStudent;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRelationToStudent() {
        return relationToStudent;
    }

    public void setRelationToStudent(String relationToStudent) {
        this.relationToStudent = relationToStudent;
    }
}
