package sample;

import java.util.*;

class StudentMarksSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        String[][] students = new String[n][2];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            students[i][0] = sc.next();
            System.out.print("Enter total marks: ");
            students[i][1] = String.valueOf(sc.nextInt());
        }
        Arrays.sort(students, (a, b) -> Integer.compare(Integer.parseInt(b[1]), Integer.parseInt(a[1])));
        for (String[] student : students) {
            System.out.println(student[0] + " - " + student[1]);
        }
    }
}