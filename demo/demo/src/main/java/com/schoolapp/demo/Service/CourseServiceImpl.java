package com.schoolapp.demo.Service;

import com.schoolapp.demo.Entity.CourseEntity;
import com.schoolapp.demo.Repository.CourseRepository;
import com.schoolapp.demo.Service.Interface.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public CourseEntity createCourse( CourseEntity courseEntity) {
        return courseRepository.save(courseEntity);
    }


    @Override
    public List<CourseEntity> getAllCourse() {
        return courseRepository.findAll();
    }

    @Override
    public CourseEntity getCourseById( Integer id) {
        return courseRepository.findById(id).orElseThrow(
                ()-> new RuntimeException("Course Not available")
        );
    }
}
