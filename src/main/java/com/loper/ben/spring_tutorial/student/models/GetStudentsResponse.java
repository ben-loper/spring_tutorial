package com.loper.ben.spring_tutorial.student.models;

import java.util.List;

public class GetStudentsResponse {

    List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
