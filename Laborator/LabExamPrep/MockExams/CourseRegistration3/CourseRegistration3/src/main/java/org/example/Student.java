package org.example;

public class Student {

    private int studentId;
    private int courseCode;
    private String semester;
    private double grade;
    private String status;

    public Student(int studentId, int courseCode, String semester, double grade, String status) {
        this.studentId = studentId;
        this.courseCode = courseCode;
        this.semester = semester;
        this.grade = grade;
        this.status = status;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
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
                "studentId=" + studentId +
                ", courseCode=" + courseCode +
                ", semester='" + semester + '\'' +
                ", grade=" + grade +
                ", status='" + status + '\'' +
                '}';
    }
}
