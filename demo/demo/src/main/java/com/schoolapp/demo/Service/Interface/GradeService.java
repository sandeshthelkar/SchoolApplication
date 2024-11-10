package com.schoolapp.demo.Service.Interface;

import com.schoolapp.demo.Entity.GradeEntity;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface GradeService {

    public void createGrade (String examName, BigDecimal score, BigDecimal maxScore, String remarks,Integer studentId,Integer courseId);
    public List<GradeEntity> getGradeByStudent(Integer studentId);
}
