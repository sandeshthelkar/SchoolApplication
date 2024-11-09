package com.schoolapp.demo.Service;

import com.schoolapp.demo.Entity.StudentEntity;
import com.schoolapp.demo.Repository.StudentRepository;
import com.schoolapp.demo.Service.Interface.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public StudentEntity createStudent(StudentEntity student) {
        return studentRepository.save(student);
    }

    @Override
    public List<StudentEntity> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public StudentEntity getStudentById(Integer id) {
        return studentRepository.findById(id).orElseThrow(
                ()-> new RuntimeException("Student not Available"));
    }

    @Override
    public StudentEntity updateStudent(Integer id, StudentEntity student) {
        Optional<StudentEntity> existingStudent = studentRepository.findById(id);
        if(existingStudent.isPresent()){
            StudentEntity updatedStudent = existingStudent.get();
            updatedStudent.setName(student.getName());
            updatedStudent.setEmail(student.getEmail());
            updatedStudent.setAge(student.getAge());
            return studentRepository.save(updatedStudent);
        }
        return null;
    }

    @Override
    public void deleteStudent(Integer id) {
        studentRepository.deleteById(id);
    }
}
