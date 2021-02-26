package com.loper.ben.spring_tutorial.student.dao;

import com.loper.ben.spring_tutorial.student.models.Student;

import java.util.List;
import java.util.UUID;

public interface StudentDao {

    List<Student> getAllStudents();

    Student getStudentById(UUID id);

    Student createStudent(Student student);
}
