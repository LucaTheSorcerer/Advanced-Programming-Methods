package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFromFile {

    public static ArrayList<Student> readFromFile(String filename) {

        ArrayList<Student> studentArrayList = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(filename))) {
            br.readLine();
            String line;

            while((line = br.readLine()) != null) {
                String[] data = line.split("_");
                Student student = new Student(Integer.parseInt(data[0]), Integer.parseInt(data[1]), data[2], Double.parseDouble(data[3]), data[4]);
                studentArrayList.add(student);

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return studentArrayList;
    }

}
