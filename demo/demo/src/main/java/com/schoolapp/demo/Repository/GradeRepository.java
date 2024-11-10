package com.schoolapp.demo.Repository;

import com.schoolapp.demo.Entity.GradeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GradeRepository extends JpaRepository<GradeEntity,Integer> {
    List<GradeEntity> findByStudent_Id(Integer studentId);
}
