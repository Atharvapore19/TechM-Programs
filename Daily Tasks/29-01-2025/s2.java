package sample;

import java.util.Scanner;

public class s2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        switch (number % 2) {
            case 0 -> System.out.println(number + " is Even.");
            case 1, -1 -> System.out.println(number + " is Odd."); // Handles negative odd numbers
            default -> System.out.println("Invalid input.");
        }
    }
}
