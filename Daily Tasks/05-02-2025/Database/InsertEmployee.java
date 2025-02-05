package Jdbc;
import java.sql.*;
import java.util.Scanner;

public class InsertEmployee {
    public static void insertEmployee(Connection con, Scanner scanner) throws SQLException {
        String query = "INSERT INTO employee (empId, empName, salary) VALUES (?, ?, ?)";
        PreparedStatement pstmt = con.prepareStatement(query);

        System.out.println("Enter Employee ID:");
        int empId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Employee Name:");
        String empName = scanner.nextLine();
        System.out.println("Enter Salary:");
        int salary = scanner.nextInt();
        pstmt.setInt(1, empId);
        pstmt.setString(2, empName);
        pstmt.setInt(3, salary);
        pstmt.executeUpdate();
        System.out.println("Row inserted successfully.");

        System.out.println("Do you want to insert another? (yes/no)");
        scanner.nextLine();
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            insertEmployee(con, scanner);
        }
    }

    public static void main(String args[]) {
        try (Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/techm?useSSL=false&allowPublicKeyRetrieval=true", "root", "tiger");
             Scanner scanner = new Scanner(System.in)) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            insertEmployee(con, scanner);
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
