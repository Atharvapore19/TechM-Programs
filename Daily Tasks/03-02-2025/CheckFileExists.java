package com.files;

import java.io.File;

public class CheckFileExists {
    public static void main(String[] args) {
        File file = new File("C:/Users/athar/OneDrive/Desktop/TechM Training");
        if (file.exists()) {
            System.out.println("File exists");
        } else {
            System.out.println("File does not exist");
        }
    }
}
