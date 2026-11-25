package Q22Employee;

public class PermanentEmployee implements Payroll{
    public double calculateSalary(){
        return 5000;
    }
    public double calculateTax() {
        return calculateSalary() * 0.10;
    }
    public double netSalary() {
        return calculateSalary() - calculateTax();
    }
}
