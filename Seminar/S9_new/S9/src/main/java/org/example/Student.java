package org.example;

import java.util.List;

public class Student {

    private String Name;
    private String University;

    List<Pair<String, Integer>> course;

    public Student(String name, String university) {
        Name = name;
        University = university;
    }

    public List<Pair<String, Integer>> getCourse() {
        return course;
    }

    public Student(String name, String university, List<Pair<String, Integer>> course) {
        Name = name;
        University = university;
        this.course = course;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getUniversity() {
        return University;
    }

    public void setUniversity(String university) {
        University = university;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", University='" + University + '\'' +
                '}';
    }
}
