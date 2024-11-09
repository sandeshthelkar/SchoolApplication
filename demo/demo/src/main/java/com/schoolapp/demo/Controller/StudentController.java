package com.schoolapp.demo.Controller;

import com.schoolapp.demo.Entity.StudentEntity;
import com.schoolapp.demo.Service.Interface.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @PostMapping
    public void createStudent(@RequestBody StudentEntity student){
        studentService.createStudent(student);
    }

    @GetMapping
    public List<StudentEntity> getAllStudent(){
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public StudentEntity getStudentById(@PathVariable Integer id){
        return studentService.getStudentById(id);
    }

    @PutMapping("/{id}")
    public StudentEntity updateStudent( @PathVariable Integer id,@RequestBody StudentEntity student){
        return studentService.updateStudent(id,student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Integer id){
        studentService.deleteStudent(id);
    }
}
