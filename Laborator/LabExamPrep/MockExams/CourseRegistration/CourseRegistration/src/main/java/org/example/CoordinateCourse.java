package org.example;

public class CoordinateCourse {

    TeacherStrategy teacherStrategy;

    public CoordinateCourse(TeacherStrategy teacherStrategy) {
        this.teacherStrategy = teacherStrategy;
    }

    public TeacherStrategy getTeacherStrategy() {
        return teacherStrategy;
    }

    public void setTeacherStrategy(TeacherStrategy teacherStrategy) {
        this.teacherStrategy = teacherStrategy;
    }

    public String runStrategy() {
        return teacherStrategy.teaching();
    }
}
