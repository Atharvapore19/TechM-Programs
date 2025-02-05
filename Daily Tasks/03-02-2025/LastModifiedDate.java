package com.files;
import java.io.File;
import java.util.Date;

public class LastModifiedDate {
    public static void main(String[] args) {
        File file = new File("C:/Users/athar/OneDrive/Desktop/TechM Training/Tasks TBD-30th Jan Session-1.txt");
        if (file.exists()) {
            System.out.println("Last Modified: " + new Date(file.lastModified()));
        } else {
            System.out.println("File does not exist");
        }
    }
}

