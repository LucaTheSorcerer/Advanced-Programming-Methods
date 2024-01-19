package org.example;

import java.util.ArrayList;

public class TeacherTest {

    public void test(ArrayList<String> courses) {
        TeacherStrategy teacherStrategy1 = new SubstituteTeacher();
        TeacherStrategy teacherStrategy2 = new CourseCoordinator();

        CoordinateCourse courseCoordinator = new CoordinateCourse(teacherStrategy1);

        courses.stream()
                .forEach(course -> {
                    assert("Substitute teacher is teaching!").equals(courseCoordinator.runStrategy());
                });
    }

}
