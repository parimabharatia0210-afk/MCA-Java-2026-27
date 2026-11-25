import java.util.Scanner;

public class EmployeePayrollSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Object of PayrollSystem class is created to manage the employees and their payroll.
        PayrollSystem payrollSystem = new PayrollSystem();

        System.out.println("========== EMPLOYEE PAYROLL SYSTEM ==========");

        boolean running = true;

        while (running) {
            System.out.println("1. Add Full-Time Employee");
            System.out.println("2. Add Part-Time Employee");
            System.out.println("3. Add Contractor");
            System.out.println("4. Add Manager");
            System.out.println("5. Display All Employees");
            System.out.println("6. Sort Employees by Salary");
            System.out.println("7. Display Department-Wise Salary Totals");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    try {
                        System.out.print("Enter Employee ID: ");
                        int id = sc.nextInt();
                        // Consume the newline character after reading an integer
                        sc.nextLine();
                        System.out.print("Enter Employee Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Employee Department: ");
                        String department = sc.nextLine();
                        System.out.print("Enter Monthly Salary: ");
                        int salary = sc.nextInt();

                        // Creating a FullTimeEmployee object with the provided details
                        FullTimeEmployee employee = new FullTimeEmployee(id, name, department, salary);

                        payrollSystem.addEmployee(employee);
                        System.out.println("Full-Time Employee added successfully!");
                    } catch (PayrollException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        System.out.print("Enter Employee ID: ");
                        int id = sc.nextInt();
                        // Consume the newline character after reading an integer
                        sc.nextLine();
                        // sc.nextLine();

                        System.out.print("Enter Employee Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Employee Department: ");
                        String department = sc.nextLine();

                        System.out.print("Enter working hours : ");
                        int hours = sc.nextInt();

                        System.out.print("Enter rate: ");
                        int rate = sc.nextInt();

                        // Creating a PartTimeEmployee object with the provided details
                        PartTimeEmployee employee = new PartTimeEmployee(id, name, department, hours, rate);
                        payrollSystem.addEmployee(employee);

                        System.out.println("Part-Time Employee added successfully!");
                    } catch (PayrollException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        System.out.print("Enter Employee ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Employee Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Employee Department: ");
                        String department = sc.nextLine();

                        System.out.print("Enter Fee Per Project: ");
                        double projectFee = sc.nextDouble();

                        System.out.print("Enter Number of Projects: ");
                        int projectCount = sc.nextInt();

                        // Creating a Contractor object with the provided details
                        Contractor employee = new Contractor(id, name, department, projectFee, projectCount);

                        payrollSystem.addEmployee(employee);

                        System.out.println("Contractor added successfully!");

                    } catch (PayrollException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        System.out.print("Enter Employee ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Employee Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Employee Department: ");
                        String department = sc.nextLine();

                        System.out.print("Enter Base Salary: ");
                        double baseSalary = sc.nextDouble();

                        System.out.print("Enter Bonus: ");
                        double bonus = sc.nextDouble();

                        // Creating a Manager object with the provided details
                        Manager employee = new Manager(id, name, department, baseSalary, bonus);

                        payrollSystem.addEmployee(employee);

                        System.out.println("Manager added successfully!");

                    } catch (PayrollException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 5:
                    payrollSystem.displayEmployees();
                    break;
                case 6:
                    payrollSystem.sortEmployeesBySalary();
                    break;
                case 7:
                    payrollSystem.displayDepartmentWiseTotals();
                    break;
                case 8:
                    System.out.println("Exiting Employee Payroll System...");
                    running = false;
                    break;
                default:
                    break;
            }
        }
        sc.close();
    }
}