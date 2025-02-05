package sample;

import java.util.Scanner;

class Employee {
    private int empId;
    private String empName;
    private double sal;
    private int yearsWorked;

    public void setEmployeeDetails(int empId, String empName, double sal, int yearsWorked) {
        this.empId = empId;
        this.empName = empName;
        this.sal = sal;
        this.yearsWorked = yearsWorked;
    }

    public void getEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Annual Salary: " + sal);
        System.out.println("Years Worked: " + yearsWorked);
    }

    public void getLoanEligibility() {
        if (yearsWorked > 5) {
            if (sal >= 1500000) {
                System.out.println("Loan Granted: 7 Lakhs");
            } else if (sal >= 1000000) {
                System.out.println("Loan Granted: 5 Lakhs");
            } else if (sal >= 600000) {
                System.out.println("Loan Granted: 2 Lakhs");
            } else {
                System.out.println("Not Eligible for Loan");
            }
        } else {
            System.out.println("Not Eligible for Loan");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Annual Salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter Years Worked: ");
        int years = sc.nextInt();
        emp.setEmployeeDetails(id, name, salary, years);
        emp.getEmployeeDetails();
        emp.getLoanEligibility();
        sc.close();
    }
}
