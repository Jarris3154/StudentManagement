package com.jia.studentmanagement.controller;

import com.jia.studentmanagement.repository.TeacherRepository;
import com.jia.studentmanagement.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Jarris on 10/21/2018.
 */
@RestController
public class TeacherController {

    @Autowired
    private TeacherRepository teacherRepository;

    @GetMapping("/teachers")
    public Iterable<Teacher> getAllTeachers(){

        return teacherRepository.findAll();
    }
}
