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

    @Column(nullable = false)
    private String status;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private LibraryBookEntity libraryBookEntity;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private StudentEntity studentEntity;
}
