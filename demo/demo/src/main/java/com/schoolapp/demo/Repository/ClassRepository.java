package com.schoolapp.demo.Repository;

import com.schoolapp.demo.Entity.ClassEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRepository extends JpaRepository<ClassEntity,Integer> {
}
