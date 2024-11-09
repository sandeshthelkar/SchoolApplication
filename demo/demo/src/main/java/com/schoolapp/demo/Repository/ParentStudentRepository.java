package com.schoolapp.demo.Repository;

import com.schoolapp.demo.Entity.ParentStudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParentStudentRepository extends JpaRepository<ParentStudentEntity,Integer> {
}
