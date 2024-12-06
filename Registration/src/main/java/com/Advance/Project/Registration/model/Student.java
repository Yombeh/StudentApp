package com.Advance.Project.Registration.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    private String userName;
    private int matNumber;
    private int Course;
    private int grade;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getMatNumber() {
        return matNumber;
    }

    public void setMatNumber(int matNumber) {
        this.matNumber = matNumber;
    }

    public int getCourse() {
        return Course;
    }

    public void setCourse(int classDuration) {
        this.Course = classDuration;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

}
