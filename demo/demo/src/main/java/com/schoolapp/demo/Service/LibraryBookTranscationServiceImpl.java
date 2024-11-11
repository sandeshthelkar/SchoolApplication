package com.schoolapp.demo.Service;

import com.schoolapp.demo.Entity.LibraryBookEntity;
import com.schoolapp.demo.Entity.LibraryTransactionEntity;
import com.schoolapp.demo.Entity.StudentEntity;
import com.schoolapp.demo.Repository.LibraryBookRepository;
import com.schoolapp.demo.Repository.LibraryTransactionRepository;
import com.schoolapp.demo.Repository.StudentRepository;
import com.schoolapp.demo.Service.Interface.LibraryBookTranscationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class LibraryBookTranscationServiceImpl implements LibraryBookTranscationService {

    @Autowired
    private LibraryBookRepository libraryBookRepository;
    @Autowired
    private LibraryTransactionRepository libraryTransactionRepository;
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void addNewBook(LibraryBookEntity libraryBookEntity) {
        libraryBookRepository.save(libraryBookEntity);
    }

    @Override
    public void issueBookToStudent(Integer bookId, Integer studentId) {

        LibraryBookEntity book = libraryBookRepository.findById(bookId).orElseThrow(
                ()-> new RuntimeException("Book not found")
        );
        StudentEntity student = studentRepository.findById(studentId).orElseThrow(
                ()-> new RuntimeException("Student not found")
        );
        //checking availability of the book in library
        if(book.getAvailable() <= 0){
            throw new RuntimeException("Book Not available");
        }

        // adding transaction to library_transaction

        LibraryTransactionEntity libraryTransactionEntity = new LibraryTransactionEntity();
        libraryTransactionEntity.setLibraryBookEntity(book);
        libraryTransactionEntity.setStudentEntity(student);
        libraryTransactionEntity.setBorrowDate(LocalDate.now());
        libraryTransactionEntity.setDueDate(LocalDate.now().plusDays(15));
        libraryTransactionEntity.setStatus("Issued");

        //Decrementing the count in books in library
        book.setAvailable(book.getAvailable()-1);
        libraryBookRepository.save(book);
        libraryTransactionRepository.save(libraryTransactionEntity);
    }

    @Override
    public void ReturnBookFromStudent(Integer transactionId) {

        LibraryTransactionEntity transaction = libraryTransactionRepository.findById(transactionId)
                .orElseThrow(()-> new RuntimeException("Transaction not found"));

            if(!transaction.getStatus().equals("Issued")){
                throw new RuntimeException("Book has already been returned or transaction is invalid");
            }
        transaction.setReturnDate(LocalDate.now());
        transaction.setStatus("Returned");

        LibraryBookEntity book = transaction.getLibraryBookEntity();
        book.setAvailable(book.getAvailable()+1);

        libraryBookRepository.save(book);
        libraryTransactionRepository.save(transaction);
    }
}
