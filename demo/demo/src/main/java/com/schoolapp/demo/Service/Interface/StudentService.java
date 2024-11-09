package com.schoolapp.demo.Service.Interface;

import com.schoolapp.demo.Entity.StudentEntity;

import java.util.List;

public interface StudentService {

    StudentEntity createStudent(StudentEntity student);
    List<StudentEntity> getAllStudents();
    StudentEntity getStudentById (Integer id);
    StudentEntity updateStudent (Integer id, StudentEntity student);
    void deleteStudent (Integer id);

}
