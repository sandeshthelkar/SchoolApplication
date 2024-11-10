package com.schoolapp.demo.Controller;

import com.schoolapp.demo.Entity.AttendanceEntity;
import com.schoolapp.demo.Service.Interface.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/attendance")
public class AttendanceController {

    @Autowired
    private AttendanceService attendanceService;

    @PostMapping
    public void recordAttendance(@RequestBody AttendanceEntity request) {
        // Ensure the Student and Teacher entities are properly set
        attendanceService.recordAttendance(
                request.getDate(),
                request.getStatus(),
                request.getRemarks(),
                request.getStudent().getId(),  // Using the Student entity's ID
                request.getTeacher().getId() // Using the Teacher entity's ID
        );
    }

    @GetMapping
    public List<AttendanceEntity> getAllAttendance() {
        return attendanceService.getAllAttendance();
    }
}
