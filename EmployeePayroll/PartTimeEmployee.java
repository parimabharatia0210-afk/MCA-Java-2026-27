public class PartTimeEmployee extends Employee{
    private int hoursWorked;
    private int hourlyRate;

    public PartTimeEmployee(int employeeId, String name, String department, int hoursWorked, int hourlyRate)throws PayrollException{
        super(employeeId, name, department);
        setHoursWorked(hoursWorked);
        setHourlyRate(hourlyRate);
    }
    @Override
    public double calculatePay() {
        double pay = hoursWorked * hourlyRate;
        return pay;
    }

    public int getHoursWorked(){
        return hoursWorked;
    }

    public int getHourlyRate(){
        return hourlyRate;
    }
    
    public void setHoursWorked(int hoursWorked)throws PayrollException{
        if(hoursWorked < 0)
            // Throwing PayrollException if hoursWorked is less than 0
            throw new PayrollException("hoursWorked must be greater than or equal to 0");
        this.hoursWorked = hoursWorked;
    }

    public void setHourlyRate(int hourlyRate)throws PayrollException{
        if(hourlyRate < 0)
            // Throwing PayrollException if hourlyRate is less than 0
            throw new PayrollException("hourlyRate must be greater than or equal to 0");
        this.hourlyRate = hourlyRate;
    }
}
