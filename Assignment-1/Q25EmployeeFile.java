import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

class Employee {
    int id;
    String name, department;
    double salary;
}

public class Q25EmployeeFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Employee e = new Employee();

            System.out.print("Enter ID: ");
            e.id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            e.name = sc.nextLine();

            System.out.print("Enter Department: ");
            e.department = sc.nextLine();

            System.out.print("Enter Salary: ");
            e.salary = sc.nextDouble();

            FileOutputStream fos = new FileOutputStream("Emp.txt");

            String data = e.id + "\n" + e.name + "\n" + e.department + "\n" + e.salary;
            fos.write(data.getBytes());
            fos.close();

            FileInputStream fis = new FileInputStream("Emp.txt");

            System.out.println("\nEmployee Details:");

            int ch;
            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }

            fis.close();

        } catch (IOException e) {
            System.out.println("File error!");
        } catch (Exception e) {
            System.out.println("Invalid input!");
        }

        sc.close();
    }
}