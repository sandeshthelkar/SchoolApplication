package com.schoolapp.demo.Service;

import com.schoolapp.demo.Entity.CourseEntity;
import com.schoolapp.demo.Entity.GradeEntity;
import com.schoolapp.demo.Entity.StudentEntity;
import com.schoolapp.demo.Repository.CourseRepository;
import com.schoolapp.demo.Repository.GradeRepository;
import com.schoolapp.demo.Repository.StudentRepository;
import com.schoolapp.demo.Service.Interface.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class GradeServiceImpl implements GradeService {

    @Autowired
    private GradeRepository gradeRepository;
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private CourseRepository courseRepository;

    @Override
    public void createGrade(String examName, BigDecimal score, BigDecimal maxScore, String remarks, Integer studentId, Integer courseId) {

        if (studentId == null || courseId == null) {
            throw new IllegalArgumentException("Student ID and Course ID must not be null");
        }
        GradeEntity grade = new GradeEntity();
        grade.setExamName(examName);
        grade.setScore(score);
        grade.setMaxScore(maxScore);
        grade.setRemarks(remarks);
        StudentEntity studentEntity = studentRepository.findById(studentId).orElseThrow(()->new RuntimeException("Student Id not found"));
        grade.setStudent(studentEntity);
        CourseEntity courseEntity = courseRepository.findById(courseId).orElseThrow(()->new RuntimeException("Course Id not found"));
        grade.setCourse(courseEntity);
        gradeRepository.save(grade);    }

    @Override
    public List<GradeEntity> getGradeByStudent(Integer studentId) {
        return gradeRepository.findByStudent_Id(studentId);
    }
}
