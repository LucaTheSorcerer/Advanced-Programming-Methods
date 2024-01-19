package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteStudentsToFile {

    public static void writeStudentsToFile(List<Student> studentList, String filename) {

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {

            studentList.stream()
                    .filter(student -> "Failed".equals(student.getStatus()))
                    .map(Student::getStudentID)
                    .forEach(name -> {
                        try {
                            bw.write(name + "\n");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
