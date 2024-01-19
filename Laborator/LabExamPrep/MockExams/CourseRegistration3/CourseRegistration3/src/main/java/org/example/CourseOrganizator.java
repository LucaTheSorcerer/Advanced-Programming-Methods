package org.example;

public class CourseOrganizator {

    TeachingStrategy teachingStrategy;

    public CourseOrganizator(TeachingStrategy teachingStrategy) {
        this.teachingStrategy = teachingStrategy;
    }

    public TeachingStrategy getTeachingStrategy() {
        return teachingStrategy;
    }

    public void setTeachingStrategy(TeachingStrategy teachingStrategy) {
        this.teachingStrategy = teachingStrategy;
    }

    public String executeStrategy() {
        return teachingStrategy.teach();
    }


}
