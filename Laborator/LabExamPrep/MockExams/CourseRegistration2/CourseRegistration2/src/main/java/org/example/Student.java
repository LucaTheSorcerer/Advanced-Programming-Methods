package org.example;

public class Student {

    private int studentID;
    private int courseCode;
    private String semester;
    private double grade;
    private String status;

    public Student(int studentID, int courseCode, String semester, double grade, String status) {
        this.studentID = studentID;
        this.courseCode = courseCode;
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

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
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
                ", courseCode=" + courseCode +
                ", semester='" + semester + '\'' +
                ", grade=" + grade +
                ", status='" + status + '\'' +
                '}';
    }
}
