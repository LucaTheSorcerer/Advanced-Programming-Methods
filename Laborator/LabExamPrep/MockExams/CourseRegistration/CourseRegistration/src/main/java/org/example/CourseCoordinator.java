package org.example;

public class CourseCoordinator implements TeacherStrategy {

    @Override
    public String teaching() {
        return "Course coordinator is teaching!";
    }
}
