package com.loper.ben.spring_tutorial.student.dao;

import com.loper.ben.spring_tutorial.student.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(UUID id) {
        return studentRepository.getOne(id);
    }

    @Override
    public Student createStudent(Student student) {
        student.setId(UUID.randomUUID());
        return studentRepository.save(student);
    }
}
