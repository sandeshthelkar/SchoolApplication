package com.schoolapp.demo.Service;

import com.schoolapp.demo.Entity.TeacherEntity;
import com.schoolapp.demo.Repository.TeacherRepository;
import com.schoolapp.demo.Service.Interface.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public TeacherEntity createTeacher( TeacherEntity teacher) {
        return teacherRepository.save(teacher);
    }

    @Override
    public List<TeacherEntity> getAllTeachers() {
        return teacherRepository.findAll();
    }

    @Override
    public TeacherEntity getTeacherById( Integer id) {
        return teacherRepository.findById(id).orElseThrow(
                ()-> new RuntimeException("Teacher not Available"));
    }

    @Override
    public TeacherEntity updateTeacher( Integer id,  TeacherEntity teacher) {
        Optional<TeacherEntity> existingTeacher = teacherRepository.findById(id);
        if(existingTeacher.isPresent()){
            TeacherEntity updatedTeacher = existingTeacher.get();
            updatedTeacher.setEmail(teacher.getEmail());
            updatedTeacher.setPhone(teacher.getPhone());
            teacherRepository.save(updatedTeacher);
        }
        return  null;
    }

    @Override
    public void deleteTeacher( Integer id) {
        teacherRepository.deleteById(id);
    }
}
