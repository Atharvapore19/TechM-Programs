package com.files;

import java.io.File;

public class CheckFileOrDirectory {
    public static void main(String[] args) {
        File file = new File("C:/Users/athar/OneDrive/Desktop/TechM Training");
        if (file.isDirectory()) {
            System.out.println("It is a directory");
        } else if (file.isFile()) {
            System.out.println("It is a file");
        } else {
            System.out.println("Path does not exist");
        }
    }
}
