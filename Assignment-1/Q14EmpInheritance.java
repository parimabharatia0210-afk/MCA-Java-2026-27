class Employee {
    String name = "Rahul";
    double basicSalary = 30000;
}

class Q14EmpInheritance extends Employee {
    double bonus = 5000;

    void display() {
        double totalSalary = basicSalary + bonus;

        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + totalSalary);
    }

    public static void main(String[] args) {
        Q14EmpInheritance m = new Q14EmpInheritance();
        m.display();
    }
}
