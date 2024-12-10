package org.isep;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

    public static void main(String[] args) {
        String filePath = "src/main/resources/lyrics.txt";
        try {
            FileWriter fileWriter = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("\nHi");

            bufferedWriter.close();

        } catch (IOException e) {
            System.out.println("No file to write");
        }
    }
}
