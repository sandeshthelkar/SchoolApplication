package com.schoolapp.demo.Service.Interface;

import com.schoolapp.demo.Entity.ClassEntity;

import java.util.List;

public interface ClassService {

    public ClassEntity createClass (ClassEntity classEntity);
    public List<ClassEntity>getAllClass();
    public ClassEntity getClassById(Integer id);

}
