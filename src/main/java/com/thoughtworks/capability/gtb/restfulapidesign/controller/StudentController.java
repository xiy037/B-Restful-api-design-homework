package com.thoughtworks.capability.gtb.restfulapidesign.controller;

import com.thoughtworks.capability.gtb.restfulapidesign.entity.Student;
import com.thoughtworks.capability.gtb.restfulapidesign.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable("id") Integer id) {
        Student student = studentService.getStudentById(id);
        if (student == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return student;
    }
}
