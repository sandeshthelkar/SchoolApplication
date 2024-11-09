package com.schoolapp.demo.Repository;

import com.schoolapp.demo.Entity.ClassCourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassCourseRepository extends JpaRepository<ClassCourseEntity, Integer> {
}
