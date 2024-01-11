package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSVFileWriter {

    public void writeCountriesToCSV(List<Country> countries, String filename) throws IOException {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {

            for(Country country : countries) {
                bw.write(country.toString());
                bw.newLine();
            }

        } catch(IOException e) {
            throw new IOException();
        }
    }
}
