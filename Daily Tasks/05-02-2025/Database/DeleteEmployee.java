package Jdbc;
import java.sql.*;
import java.util.Scanner;

public class DeleteEmployee {
    public static void main(String args[]) {
        try (Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/techm?useSSL=false&allowPublicKeyRetrieval=true", "root", "tiger");
             Scanner scanner = new Scanner(System.in)) {
            Class.forName("com.mysql.cj.jdbc.Driver");

            System.out.println("Enter Employee ID to delete:");
            int empId = scanner.nextInt();

            String query = "DELETE FROM employee WHERE empId = ?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, empId);
            int rowsDeleted = pstmt.executeUpdate();
            System.out.println(rowsDeleted > 0 ? "Row deleted successfully." : "Employee ID not found.");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
