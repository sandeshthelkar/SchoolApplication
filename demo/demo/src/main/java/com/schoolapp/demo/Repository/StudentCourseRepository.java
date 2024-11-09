package com.schoolapp.demo.Repository;

import com.schoolapp.demo.Entity.StudentCourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentCourseRepository extends JpaRepository<StudentCourseEntity,Integer> {
}
