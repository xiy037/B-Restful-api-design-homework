package com.thoughtworks.capability.gtb.restfulapidesign.service;

import com.thoughtworks.capability.gtb.restfulapidesign.entity.Gender;
import com.thoughtworks.capability.gtb.restfulapidesign.entity.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentService {
    private Map<Integer, Student> students = new HashMap<>();

    public StudentService() {
        students.put(1, new Student(1, "Alex", Gender.MALE, ""));
        students.put(2, new Student(2, "Albx", Gender.MALE, ""));
        students.put(3, new Student(3, "Alcx", Gender.MALE, ""));
        students.put(4, new Student(4, "Aldx", Gender.MALE, ""));
        students.put(5, new Student(5, "Alex", Gender.FEMALE, ""));
        students.put(6, new Student(6, "Alfx", Gender.FEMALE, ""));
        students.put(7, new Student(7, "Algx", Gender.FEMALE, ""));
        students.put(8, new Student(8, "Alejx", Gender.FEMALE, ""));

    }

    public List<Student> getAllStudents() {
        return new ArrayList<>(students.values());
    }
}
