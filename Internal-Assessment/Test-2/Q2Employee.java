class Q2Employee {

    private int empId;
    private String name;
    private double basicSalary;
    private double bonus = 10;   // 10%

    Q2Employee(int empId, String name, double basicSalary) {
        this.empId = empId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    double getSalary() {
        double totalSalary;
        totalSalary = basicSalary + (basicSalary * bonus / 100);
        return totalSalary;
    }

    void changeBonus(double b) {
        bonus = b;
    }

    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Total Salary: " + getSalary());
    }

    public static void main(String[] args) {

        Q2Employee[] employee = new Q2Employee[3];

        employee[0] = new Q2Employee(1, "Areen", 10000);
        employee[1] = new Q2Employee(2, "Rahul", 15000);
        employee[2] = new Q2Employee(3, "Amit", 20000);

        for (int i = 0; i < employee.length; i++) {
            employee[i].display();
            System.out.println();
        }
    }
}