package com.schoolapp.demo.Controller;

import com.schoolapp.demo.Entity.ClassEntity;
import com.schoolapp.demo.Service.Interface.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/class")
public class ClassController {

    @Autowired
    private ClassService classService;

    @PostMapping
    public ClassEntity createClass(@RequestBody ClassEntity classEntity){
        return classService.createClass(classEntity);
    }

    @GetMapping
    public List<ClassEntity>getAllClass(){
        return classService.getAllClass();
    }

    @GetMapping("/{id}")
    public ClassEntity getClassById (@PathVariable Integer id){
        return classService.getClassById(id);
    }
}
