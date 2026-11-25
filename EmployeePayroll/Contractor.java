public class Contractor extends Employee{
    private double projectFee;
    private int projectCount;

    public Contractor(int employeeId, String name, String department, double projectFee, int projectCount)throws PayrollException{
        super(employeeId, name, department);
        setProjectFee(projectFee);
        setProjectCount(projectCount);
    }

    @Override 
    public double calculatePay() {
        double pay = projectFee * projectCount;
        return pay;
    }

    public double getProjectFee(){
        return projectFee;
    }

    public int getProjectCount(){
        return projectCount;
    }

    public void setProjectFee(double projectFee) throws PayrollException{
        // isFinite checks if the value is finite (not NaN or infinity)
        if(projectFee < 0 || !Double.isFinite(projectFee)){
            // Throwing PayrollException if projectFee is negative or not finite
            throw new PayrollException("projectFee must be greater than or equal to 0");
        }
        this.projectFee = projectFee;
    }

    public void setProjectCount(int projectCount)throws PayrollException{
        if(projectCount < 0){
            throw new PayrollException("projectCount must be greater than or equal to 0");
        }
        this.projectCount = projectCount;
    }
}