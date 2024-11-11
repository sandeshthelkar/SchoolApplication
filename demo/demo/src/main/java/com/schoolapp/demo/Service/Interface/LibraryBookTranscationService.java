package com.schoolapp.demo.Service.Interface;

import com.schoolapp.demo.Entity.LibraryBookEntity;

public interface LibraryBookTranscationService {

    public void addNewBook (LibraryBookEntity libraryBookEntity);
    public void issueBookToStudent(Integer bookId, Integer studentId);
    public void ReturnBookFromStudent(Integer transactionId);
}
