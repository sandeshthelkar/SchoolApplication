package com.schoolapp.demo.Repository;

import com.schoolapp.demo.Entity.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<TeacherEntity, Integer> {
}
