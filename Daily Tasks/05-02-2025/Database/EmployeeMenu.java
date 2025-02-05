package Jdbc;
import java.sql.*;
import java.util.Scanner;

public class EmployeeMenu {
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
    }

    public static void updateEmployee(Connection con, Scanner scanner) throws SQLException {
        String query = "UPDATE employee SET empName = ?, salary = ? WHERE empId = ?";
        PreparedStatement pstmt = con.prepareStatement(query);
        System.out.println("Enter Employee ID to update:");
        int empId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter new Employee Name:");
        String empName = scanner.nextLine();
        System.out.println("Enter new Salary:");
        int salary = scanner.nextInt();
        pstmt.setString(1, empName);
        pstmt.setInt(2, salary);
        pstmt.setInt(3, empId);
        int rowsUpdated = pstmt.executeUpdate();
        System.out.println(rowsUpdated > 0 ? "Row updated successfully." : "Employee ID not found.");
    }

    public static void deleteEmployee(Connection con, Scanner scanner) throws SQLException {
        String query = "DELETE FROM employee WHERE empId = ?";
        PreparedStatement pstmt = con.prepareStatement(query);
        System.out.println("Enter Employee ID to delete:");
        int empId = scanner.nextInt();
        pstmt.setInt(1, empId);
        int rowsDeleted = pstmt.executeUpdate();
        System.out.println(rowsDeleted > 0 ? "Row deleted successfully." : "Employee ID not found.");
    }

    public static void selectEmployee(Connection con) throws SQLException {
        String query = "SELECT * FROM employee";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            System.out.println("ID: " + rs.getInt(1) + ", Name: " + rs.getString(2) + ", Salary: " + rs.getInt(3));
        }
    }

    public static void main(String args[]) {
        try (Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/techm?useSSL=false&allowPublicKeyRetrieval=true", "root", "tiger");
             Scanner scanner = new Scanner(System.in)) {
            Class.forName("com.mysql.cj.jdbc.Driver");

            while (true) {
                System.out.println("1. Insert a new Row");
                System.out.println("2. Update a Row");
                System.out.println("3. Delete a Row");
                System.out.println("4. Select the row");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        insertEmployee(con, scanner);
                        break;
                    case 2:
                        updateEmployee(con, scanner);
                        break;
                    case 3:
                        deleteEmployee(con, scanner);
                        break;
                    case 4:
                        selectEmployee(con);
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        con.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
