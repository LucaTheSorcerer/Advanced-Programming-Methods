package com.example.AnonymousClass;

public class StudentClass {

    public static void main(String[] args) {

        Student student = new Student() {

            @Override
            public void speak() {
                System.out.println("Student speaking");
            }
        };

        student.speak();
    }
}
