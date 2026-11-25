package Q22Employee;

public class ContractEmployee implements Payroll{
    public double calculateSalary() {
        return 3000;
    }

    public double calculateTax() {
        return calculateSalary() * 0.05;
    }

    public double netSalary() {
        return calculateSalary() - calculateTax();
    }
}
