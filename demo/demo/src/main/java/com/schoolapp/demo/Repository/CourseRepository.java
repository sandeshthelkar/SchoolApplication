package com.schoolapp.demo.Repository;

import com.schoolapp.demo.Entity.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<CourseEntity, Integer> {
}
