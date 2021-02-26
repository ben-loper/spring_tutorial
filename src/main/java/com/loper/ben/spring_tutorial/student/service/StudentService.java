package com.loper.ben.spring_tutorial.student.service;

import com.loper.ben.spring_tutorial.student.models.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    Student getStudentById(String id);

    Student createStudent(Student student);

    Student updateStudent(Student student);

    void deleteStudent(Student student);

}
