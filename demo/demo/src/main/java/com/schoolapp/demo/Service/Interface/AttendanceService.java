package com.schoolapp.demo.Service.Interface;

import com.schoolapp.demo.Entity.AttendanceEntity;

import java.time.LocalDate;
import java.util.List;

public interface AttendanceService {

    public void recordAttendance(LocalDate date, String status, String remarks, Integer studentId, Integer teacherId);

    public List<AttendanceEntity> getAllAttendance();
}
