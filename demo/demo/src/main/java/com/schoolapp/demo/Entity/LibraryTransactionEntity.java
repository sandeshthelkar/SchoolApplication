package com.schoolapp.demo.Entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "library_transaction")
public class LibraryTransactionEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDate borrowDate;
    private LocalDate returnDate;
    private LocalDate dueDate;

    @Column(nullable = false)
    private String status;

    @ManyToOne
    @JoinColumn(name = "book_id", nullable = false)
    private LibraryBookEntity libraryBookEntity;

    @ManyToOne
    @JoinColumn(name = "student_id",nullable = false)
    private StudentEntity studentEntity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(LocalDate borrowDate) {
        this.borrowDate = borrowDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LibraryBookEntity getLibraryBookEntity() {
        return libraryBookEntity;
    }

    public void setLibraryBookEntity(LibraryBookEntity libraryBookEntity) {
        this.libraryBookEntity = libraryBookEntity;
    }

    public StudentEntity getStudentEntity() {
        return studentEntity;
    }

    public void setStudentEntity(StudentEntity studentEntity) {
        this.studentEntity = studentEntity;
    }
}
