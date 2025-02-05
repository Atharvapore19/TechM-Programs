package sample;

import java.io.*;

public class EmptyFileException {
    public static void checkEmptyFile(String fileName) throws Exception {
        File file = new File(fileName);
        if (file.length() == 0) {
            throw new Exception("File is empty");
        }
    }

    public static void main(String[] args) {
        try {
            checkEmptyFile("empty.txt");
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
