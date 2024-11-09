package com.schoolapp.demo.Service.Interface;

import com.schoolapp.demo.Entity.TeacherEntity;

import java.util.List;

public interface TeacherService {

    TeacherEntity createTeacher(TeacherEntity teacher);
    List<TeacherEntity> getAllTeachers();
    TeacherEntity getTeacherById(Integer id);
    TeacherEntity updateTeacher (Integer id, TeacherEntity teacher);
    void deleteTeacher (Integer id);
}
