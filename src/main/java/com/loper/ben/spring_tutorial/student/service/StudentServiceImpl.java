package com.loper.ben.spring_tutorial.student.service;

import com.loper.ben.spring_tutorial.student.dao.StudentDao;
import com.loper.ben.spring_tutorial.student.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }

    @Override
    public Student getStudentById(String id) {
        return null;
    }

    @Override
    public Student createStudent(Student student) {
        return studentDao.createStudent(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return null;
    }

    @Override
    public void deleteStudent(Student student) {

    }
}
