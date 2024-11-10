package com.schoolapp.demo.Service;

import com.schoolapp.demo.Entity.AttendanceEntity;
import com.schoolapp.demo.Entity.StudentEntity;
import com.schoolapp.demo.Entity.TeacherEntity;
import com.schoolapp.demo.Repository.AttendanceRepository;
import com.schoolapp.demo.Repository.StudentRepository;
import com.schoolapp.demo.Repository.TeacherRepository;
import com.schoolapp.demo.Service.Interface.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AttendanceServiceImpl implements AttendanceService {

    @Autowired
    private AttendanceRepository attendanceRepository;
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private TeacherRepository teacherRepository;

    public void recordAttendance(LocalDate date, String status, String remarks, Integer studentId, Integer teacherId) {
        if (studentId == null || teacherId == null) {
            throw new IllegalArgumentException("Student ID and Teacher ID must not be null");
        }
        AttendanceEntity attendance = new AttendanceEntity();
        attendance.setDate(date);
        attendance.setStatus(status);
        attendance.setRemarks(remarks);
        StudentEntity studentEntity = studentRepository.findById(studentId).orElseThrow(()-> new RuntimeException("Student not present"));
        TeacherEntity teacherEntity = teacherRepository.findById(teacherId).orElseThrow(()-> new RuntimeException("Teacher not present"));
        attendance.setStudent(studentEntity);
        attendance.setTeacher(teacherEntity);
        attendanceRepository.save(attendance);
    }


    public List<AttendanceEntity> getAllAttendance() {
        return attendanceRepository.findAll();
    }
}
