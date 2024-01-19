package org.example;

public class SubstituteTeacher implements TeacherStrategy {

    @Override
    public String teaching() {
        return "Substitute teacher is teaching!";
    }
}
