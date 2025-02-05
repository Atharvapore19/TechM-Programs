package com.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileToByteArray {
    public static void main(String[] args) {
        File file = new File("C:/Users/athar/OneDrive/Desktop/TechM Training/Tasks TBD-30th Jan Session-1.txt");
        try (FileInputStream fis = new FileInputStream(file)) {
            byte[] data = new byte[(int) file.length()];
            fis.read(data);
            System.out.println("File read into byte array");
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

