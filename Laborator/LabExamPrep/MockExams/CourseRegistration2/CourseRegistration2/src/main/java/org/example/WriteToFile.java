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
                    .map(student -> student.getStudentID())
                    .forEach(name -> {
                        try {
                            bw.write(name + "\n");
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });
        }
    }
}
