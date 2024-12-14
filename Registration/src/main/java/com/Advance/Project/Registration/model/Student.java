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
    private String matNumber;
    private String Course;
    private int grade;
    private int classDuration;


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

    public String getMatNumber() {
        return matNumber;
    }

    public void setMatNumber(String matNumber) {
        this.matNumber = matNumber;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String Course) {
        this.Course = Course;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    public int getClassDuration() {
        return classDuration;
    }

    public void setClassDuration(int classDuration) {
        this.classDuration = classDuration;
    }


}
