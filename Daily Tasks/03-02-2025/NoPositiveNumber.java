package sample;
import java.io.*;
import java.util.*;

public class NoPositiveNumber {
    public static void checkNumbers(String fileName) throws Exception {
        File file = new File(fileName);
        if (!file.exists()) {
            throw new FileNotFoundException("File not found: " + fileName);
        }
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (num > 0) {
                scanner.close();
                throw new Exception("Positive number detected");
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        try {
            checkNumbers("numbers.txt");
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
