public class Manager extends Employee {
    private double baseSalary;
    private double bonus;

    public Manager(int employeeId, String name, String department, double baseSalary, double bonus) throws PayrollException {
        super(employeeId, name, department);
        setBaseSalary(baseSalary);
        setBonus(bonus);
    }

    @Override
    public double calculatePay() {
        return baseSalary + bonus;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBaseSalary(double baseSalary) throws PayrollException {
        // isFinite checks if the value is finite (not NaN or infinity)
        if (baseSalary < 0 || !Double.isFinite(baseSalary)) {
            // Throwing PayrollException if baseSalary is negative or not finite
            throw new PayrollException("Base salary must be non-negative and finite.");
        }
        this.baseSalary = baseSalary;
    }

    public void setBonus(double bonus) throws PayrollException {
        // isFinite checks if the value is finite (not NaN or infinity)
        if (bonus < 0 || !Double.isFinite(bonus)) {
            // Throwing PayrollException if bonus is negative or not finite
            throw new PayrollException("Bonus must be non-negative and finite.");
        }
        this.bonus = bonus;
    }
}