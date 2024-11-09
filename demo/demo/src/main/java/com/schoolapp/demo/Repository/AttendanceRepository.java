package com.schoolapp.demo.Repository;

import com.schoolapp.demo.Entity.AttendanceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendanceRepository extends JpaRepository<AttendanceEntity,Integer> {
}
