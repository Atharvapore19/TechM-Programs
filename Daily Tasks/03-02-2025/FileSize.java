package com.files;

import java.io.File;

public class FileSize {
    public static void main(String[] args) {
        File file = new File("C:/Users/athar/OneDrive/Desktop/TechM Training/Tasks TBD-30th Jan Session-1.txt");
        if (file.exists()) {
            long bytes = file.length();
            double kilobytes = bytes / 1024.0;
            double megabytes = kilobytes / 1024.0;
            System.out.println("File Size: " + bytes + " bytes");
            System.out.println("File Size: " + kilobytes + " KB");
            System.out.println("File Size: " + megabytes + " MB");
        } else {
            System.out.println("File does not exist");
        }
    }
}
