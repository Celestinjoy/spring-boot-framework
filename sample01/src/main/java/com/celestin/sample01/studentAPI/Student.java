package com.celestin.sample01.studentAPI;

import org.springframework.stereotype.Component;


public class Student {
    private String name;
    private int rollNumber;
    private int classOfStudying;


    public Student(String name, int rollNumber, int classOfStudying) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.classOfStudying = classOfStudying;

    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int getClassOfStudying() {
        return classOfStudying;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", classOfStudying=" + classOfStudying +
                '}';
    }
}
