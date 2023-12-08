package com.celestinjoy.springbootframework;

public class Course {
    private int courseID;
    private String courseName;
    private String Author;

    public Course(int courseID, String courseName, String author) {
        this.courseID = courseID;
        this.courseName = courseName;
        Author = author;
    }

    public int getCourseID() {
        return courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getAuthor() {
        return Author;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseID=" + courseID +
                ", courseName='" + courseName + '\'' +
                ", Author='" + Author + '\'' +
                '}';
    }
}
