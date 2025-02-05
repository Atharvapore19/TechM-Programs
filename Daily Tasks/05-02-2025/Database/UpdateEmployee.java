package Jdbc;
import java.sql.*;
import java.util.Scanner;

public class UpdateEmployee {
    public static void main(String args[]) {
        try (Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/techm?useSSL=false&allowPublicKeyRetrieval=true", "root", "tiger");
             Scanner scanner = new Scanner(System.in)) {
            Class.forName("com.mysql.cj.jdbc.Driver");

            System.out.println("Enter Employee ID to update:");
            int empId = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter new Employee Name:");
            String empName = scanner.nextLine();
            System.out.println("Enter new Salary:");
            int salary = scanner.nextInt();

            String query = "UPDATE employee SET empName = ?, salary = ? WHERE empId = ?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, empName);
            pstmt.setInt(2, salary);
            pstmt.setInt(3, empId);
            int rowsUpdated = pstmt.executeUpdate();
            System.out.println(rowsUpdated > 0 ? "Row updated successfully." : "Employee ID not found.");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
