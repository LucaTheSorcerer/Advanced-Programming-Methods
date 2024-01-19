package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteToFile {

    public static void writeToFile(ArrayList<Student> studentArrayList, String filename) throws IOException {

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            studentArrayList.stream()
                    .filter(student -> student.getStatus().equals("Failed"))
                    .map(student -> student.getStudentId())
                    .forEach(student -> {
                        try {
                            bw.write(student + "\n");
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });
        }
    }
}
