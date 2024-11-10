package com.schoolapp.demo.Repository;

import com.schoolapp.demo.Entity.StudentCourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentCourseRepository extends JpaRepository<StudentCourseEntity,Integer> {
}
