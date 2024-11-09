package com.schoolapp.demo.Controller;

import com.schoolapp.demo.Entity.TeacherEntity;
import com.schoolapp.demo.Service.Interface.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @PostMapping
    public void createTeacher(@RequestBody TeacherEntity teacher){
        teacherService.createTeacher(teacher);
    }

    @GetMapping
    public List<TeacherEntity> getAllTeacher(){
        return teacherService.getAllTeachers();
    }

    @GetMapping("/teacher/{id}")
    public TeacherEntity getTeacherById(@PathVariable Integer id){
        return teacherService.getTeacherById(id);
    }

    @PutMapping("/teacher/{id}")
    public TeacherEntity updateTeacher( @PathVariable Integer id,@RequestBody TeacherEntity teacher){
        return teacherService.updateTeacher(id,teacher);
    }

    @DeleteMapping("/teacher/{id}")
    public void deleteTeacher(@PathVariable Integer id){
        teacherService.deleteTeacher(id);
    }

}
