package com.files;

import java.io.File;

public class ListFiles {
    public static void main(String[] args) {
        File dir = new File("C:/Users/athar/OneDrive/Desktop/TechM Training");
        String[] files = dir.list();
        if (files != null) {
            for (String file : files) {
                System.out.println(file);
            }
        }
    }
}
