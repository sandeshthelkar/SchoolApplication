package com.schoolapp.demo.Controller;

import com.schoolapp.demo.Entity.GradeEntity;
import com.schoolapp.demo.Entity.StudentEntity;
import com.schoolapp.demo.Repository.StudentRepository;
import com.schoolapp.demo.Service.Interface.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/grade")
public class GradeController {

    @Autowired
    private GradeService gradeService;
    @Autowired
    private StudentRepository studentRepository;


    @PostMapping
    public void createGrade(@RequestBody GradeEntity gradeEntity){

        gradeService.createGrade(
                gradeEntity.getExamName(),
                gradeEntity.getScore(),
                gradeEntity.getMaxScore(),
                gradeEntity.getRemarks(),
                gradeEntity.getStudent().getId(),
                gradeEntity.getCourse().getId()
        );
    }

    @RequestMapping("/{studentId}")
    public List<GradeEntity> getGradeOfStudent(@PathVariable Integer studentId){
        return gradeService.getGradeByStudent(studentId);
    }
}
