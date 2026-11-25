abstract class Employee implements Payable{
    private int employeeId;
    private String name;
    private String department;

    public Employee(int employeeId, String name, String department)throws PayrollException{
        setEmployeeId(employeeId);
        setName(name);
        setDepartment(department);
    }

    public int getEmployeeId(){
        return employeeId;   
    }

    public String getName(){
        return name;
    }

    public String getDepartment(){
        return department;
    }

    public abstract double calculatePay();
    
    public void setEmployeeId(int employeeId)throws PayrollException{
        if(employeeId <= 0){
            // Throwing PayrollException if employeeId is not positive
            throw new PayrollException("Employee ID must be positive.");
        }
        this.employeeId = employeeId;
    }

    public void setName(String name) throws PayrollException{
        // isBlank checks if the string is empty or contains only whitespace
        if(name == null || name.isBlank()){
            // Throwing PayrollException if name is null or empty
            throw new PayrollException("Name must not be empty");
        }
        this.name = name;
    }

    public void setDepartment(String department)throws PayrollException{
        // isBlank checks if the string is empty or contains only whitespace
        if(department == null || department.isBlank()){
            // Throwing PayrollException if department is null or empty
            throw new PayrollException("Department must not be empty");
        }
        this.department = department;
    }
}