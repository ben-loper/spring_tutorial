package com.loper.ben.spring_tutorial.student.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table
public class Student {

    @Id
    private UUID id;

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    @Transient
    private int age;

    public Student() {
    }

    public Student(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return Period.between(this.dateOfBirth, LocalDate.now()).getYears();
    }
}
