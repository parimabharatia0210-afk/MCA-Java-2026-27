import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class PayrollSystem {
    // array list to store the employees
    private ArrayList<Employee> arrList = new ArrayList<>();

    public void addEmployee(Employee employee) {
        arrList.add(employee);
    }

    public void displayEmployees() {
        if (arrList.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            for (Employee e : arrList) {
                System.out.println("Employee ID: " + e.getEmployeeId());
                System.out.println("Employee Name: " + e.getName());
                System.out.println("Department: " + e.getDepartment());
                System.out.printf("Salary: %.2f%n", e.calculatePay());
                System.out.println("--------------------------------");
            }
        }
    }

    public void sortEmployeesBySalary() {
        if (arrList.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            arrList.sort(
                    // Comparator to sort employees based on their calculated pay in descending order 
                    Comparator.comparingDouble(Employee::calculatePay).reversed());

            System.out.println("Employees sorted by salary (highest to lowest):");
            displayEmployees();
        }
    }

    public void displayDepartmentWiseTotals() {
        if (arrList.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            // HashMap to store department-wise salary totals
            HashMap<String, Double> departmentTotals = new HashMap<>();

            for (Employee e : arrList) {
                String department = e.getDepartment();
                double salary = e.calculatePay();

                departmentTotals.put(
                        department,
                        departmentTotals.getOrDefault(department, 0.0) + salary);
            }

            // Display the department-wise totals
            for (Map.Entry<String, Double> entry : departmentTotals.entrySet()) {
                System.out.printf("Department: %s | Total Salary: ₹%.2f%n",
        entry.getKey(), entry.getValue());
            }
        }
    }
}