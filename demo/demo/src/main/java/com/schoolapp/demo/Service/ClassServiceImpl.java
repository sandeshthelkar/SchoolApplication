package com.schoolapp.demo.Service;

import com.schoolapp.demo.Entity.ClassEntity;
import com.schoolapp.demo.Repository.ClassRepository;
import com.schoolapp.demo.Service.Interface.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassServiceImpl implements ClassService {

    @Autowired
    private ClassRepository classRepository;

    @Override
    public ClassEntity createClass(ClassEntity classEntity) {
        return classRepository.save(classEntity);
    }

    @Override
    public List<ClassEntity> getAllClass() {
        return classRepository.findAll();
    }

    @Override
    public ClassEntity getClassById(Integer id) {
        return classRepository.findById(id).orElseThrow(
                ()-> new RuntimeException("Class Not available")
        );
    }
}
