package Q22Employee;

public class PartTimeEmployee implements Payroll{
    public double calculateSalary() {
        return 1500;
    }

    public double calculateTax() {
        return calculateSalary() * 0.02;
    }

    public double netSalary() {
        return calculateSalary() - calculateTax();
    }
}
