public class FullTimeEmployee extends Employee {
    private int monthlySalary;

    public FullTimeEmployee(int employeeId, String name, String department, int monthlySalary)throws PayrollException{
        super(employeeId, name, department);
        setMonthlySalary(monthlySalary);
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    @Override
    public double calculatePay() {
        return monthlySalary;
    }

    public void setMonthlySalary(int monthlySalary)throws PayrollException{
        if(monthlySalary < 0){
            // Throwing PayrollException if monthlySalary is less than 0
            throw new PayrollException("Salary must be greater than or equal to 0");
        }
        this.monthlySalary = monthlySalary;
    }
}