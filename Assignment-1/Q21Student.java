import java.util.*;

class Student {
    int rollNo;
    String name;
    double marks;

    Student(int r, String n, double m) {
        rollNo = r;
        name = n;
        marks = m;
    }
}

public class Q21Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n1.Add  2.Search  3.Update  4.Delete  5.Display  6.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Roll No: ");
                    int r = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String n = sc.nextLine();
                    System.out.print("Marks: ");
                    double m = sc.nextDouble();
                    list.add(new Student(r, n, m));
                    break;

                case 2:
                    System.out.print("Enter roll number: ");
                    r = sc.nextInt();
                    for (Student s : list) {
                        if (s.rollNo == r)
                            System.out.println(s.rollNo + " " + s.name + " " + s.marks);
                    }
                    break;

                case 3:
                    System.out.print("Enter roll number: ");
                    r = sc.nextInt();
                    sc.nextLine();
                    for (Student s : list) {
                        if (s.rollNo == r) {
                            System.out.print("New name: ");
                            s.name = sc.nextLine();
                            System.out.print("New marks: ");
                            s.marks = sc.nextDouble();
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter roll number: ");
                    r = sc.nextInt();
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).rollNo == r) {
                            list.remove(i);
                            break;
                        }
                    }
                    break;

                case 5:
                    for (Student s : list)
                        System.out.println(s.rollNo + " " + s.name + " " + s.marks);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 6);

        sc.close();
    }
}