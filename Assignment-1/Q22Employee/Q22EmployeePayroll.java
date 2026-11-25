package Q22Employee;

public class Q22EmployeePayroll {
    public static void main(String[] args) {
        Payroll p;

        p = new PermanentEmployee();
        System.out.println("Permanent Employee");
        System.out.println("Salary: " + p.calculateSalary());
        System.out.println("Tax: " + p.calculateTax());
        System.out.println("Net Salary: " + p.netSalary());

        p = new ContractEmployee();
        System.out.println("\nContract Employee");
        System.out.println("Salary: " + p.calculateSalary());
        System.out.println("Tax: " + p.calculateTax());
        System.out.println("Net Salary: " + p.netSalary());

        p = new PartTimeEmployee();
        System.out.println("\nPart-Time Employee");
        System.out.println("Salary: " + p.calculateSalary());
        System.out.println("Tax: " + p.calculateTax());
        System.out.println("Net Salary: " + p.netSalary());

    }
}
