package com.schoolapp.demo.Controller;

import com.schoolapp.demo.Entity.LibraryBookEntity;
import com.schoolapp.demo.Service.Interface.LibraryBookTranscationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/library")
public class LibraryBookTranscationController {

    @Autowired
    private LibraryBookTranscationService libraryBookTranscationService;

    @PostMapping("/add")
    public void addNewBook(@RequestBody LibraryBookEntity libraryBookEntity){
        libraryBookTranscationService.addNewBook(libraryBookEntity);
    }

    @PostMapping("/issuebook")
    public void issueBookToStudent(@RequestParam Integer bookId, @RequestParam Integer studentId){
        libraryBookTranscationService.issueBookToStudent(bookId,studentId);
    }

    @PostMapping("/returnbook")
    public void returnBookBack(@RequestParam  Integer transId){
        libraryBookTranscationService.ReturnBookFromStudent(transId);
    }
}
