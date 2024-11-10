package com.schoolapp.demo.Repository;

import com.schoolapp.demo.Entity.ParentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParentRepository extends JpaRepository<ParentEntity, Integer> {
}
