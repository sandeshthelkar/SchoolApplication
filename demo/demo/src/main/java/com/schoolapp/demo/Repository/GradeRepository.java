package com.schoolapp.demo.Repository;

import com.schoolapp.demo.Entity.GradeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GradeRepository extends JpaRepository<GradeEntity,Integer> {
}
