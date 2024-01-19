package org.example;

public class Student {

    private int studentID;
    private int course_code;
    private String semester;
    private double grade;
    private String status;

    public Student(int studentID, int course_code, String semester, double grade, String status) {
        this.studentID = studentID;
        this.course_code = course_code;
        this.semester = semester;
        this.grade = grade;
        this.status = status;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getCourse_code() {
        return course_code;
    }

    public void setCourse_code(int course_code) {
        this.course_code = course_code;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", course_code=" + course_code +
                ", semester=" + semester +
                ", grade=" + grade +
                ", status='" + status + '\'' +
                '}';
    }
}
