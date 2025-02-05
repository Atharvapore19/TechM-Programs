package com.files;

import java.io.File;
import java.io.FilenameFilter;

public class FilterFiles {
    public static void main(String[] args) {
        File dir = new File("C:/Users/athar/OneDrive/Desktop/TechM Training");
        String[] files = dir.list((dir1, name) -> name.endsWith(".txt"));
        if (files != null) {
            for (String file : files) {
                System.out.println(file);
            }
        }
    }
}

