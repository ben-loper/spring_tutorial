package com.loper.ben.spring_tutorial.student.controller;

import com.loper.ben.spring_tutorial.student.models.CreateStudentResponse;
import com.loper.ben.spring_tutorial.student.models.GetStudentsResponse;
import com.loper.ben.spring_tutorial.student.models.Student;
import com.loper.ben.spring_tutorial.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public GetStudentsResponse getStudents() {

        GetStudentsResponse response = new GetStudentsResponse();

        List<Student> students = studentService.getAllStudents();

        response.setStudents(students);

        return response;

    }

    @PostMapping
    @RequestMapping("/student")
    public CreateStudentResponse createStudent(@RequestBody Student student) {

        CreateStudentResponse response = new CreateStudentResponse();

        Student savedStudent = studentService.createStudent(student);

        response.setStudent(savedStudent);

        return response;

    }

}
