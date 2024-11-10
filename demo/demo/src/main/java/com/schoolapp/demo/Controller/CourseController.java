package com.schoolapp.demo.Controller;

import com.schoolapp.demo.Entity.CourseEntity;
import com.schoolapp.demo.Service.Interface.CourseService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping
    public CourseEntity createNewCourse(@RequestBody CourseEntity courseEntity){
        return courseService.createCourse(courseEntity);
    }

    @GetMapping
    public List<CourseEntity> getAllCourses(){
        return courseService.getAllCourse();
    }

    @GetMapping("/{id}")
    public CourseEntity getCourseById (@PathVariable Integer id){
        return courseService.getCourseById(id);
    }
}
