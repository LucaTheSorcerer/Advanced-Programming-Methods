package org.example;

import java.util.ArrayList;

public class CourseOrganizatorTest {

    public void test(ArrayList<String> courses) {

        TeachingStrategy teachingStrategy1 = new Suplinitor();
        TeachingStrategy teachingStrategy2 = new Coordonator();
        CourseOrganizator courseOrganizator = new CourseOrganizator(teachingStrategy1);

        courses.stream()
                .forEach(course -> {
                    assert ("Suplinitor is teaching!".equals(courseOrganizator.executeStrategy()));
                });

    }
}
