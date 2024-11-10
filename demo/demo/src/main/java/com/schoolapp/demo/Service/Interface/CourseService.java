package com.schoolapp.demo.Service.Interface;

import com.schoolapp.demo.Entity.ClassEntity;
import com.schoolapp.demo.Entity.CourseEntity;

import java.util.List;

public interface CourseService {

    public CourseEntity createCourse (CourseEntity courseEntity);
    public List<CourseEntity> getAllCourse();
    public CourseEntity getCourseById(Integer id);
}
