package com.schoolapp.demo.Repository;

import com.schoolapp.demo.Entity.ParentStudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParentStudentRepository extends JpaRepository<ParentStudentEntity,Integer> {
}
