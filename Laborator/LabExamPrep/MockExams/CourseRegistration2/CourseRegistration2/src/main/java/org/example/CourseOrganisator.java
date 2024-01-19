package org.example;

public class CourseOrganisator {

    TeachingStrategy teachingStrategy;

    public CourseOrganisator(TeachingStrategy teachingStrategy) {
        this.teachingStrategy = teachingStrategy;
    }

    public TeachingStrategy getTeachingStrategy() {
        return teachingStrategy;
    }

    public void setTeachingStrategy(TeachingStrategy teachingStrategy) {
        this.teachingStrategy = teachingStrategy;
    }

    public String executeStrategy() {
        return this.teachingStrategy.teach();
    }
}
