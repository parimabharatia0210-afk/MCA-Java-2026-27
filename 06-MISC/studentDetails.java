// Design a student class by identifying the essential properties and behaviour of student also write necessory constructors. Use it to create array of 5 students and display details of all students in tabular format.
class Student {
    int rollNo;
    String name;
    int age;
    double marks;

    Student(int rollNo, String name, int age, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    void display() {
        System.out.println(rollNo + "\t\t" + name + "\t" + age + "\t" + marks);
    }
}

public class studentDetails {
    public static void main(String[] args) {

        Student[] students = new Student[5];

        students[0] = new Student(101, "Areen", 22, 89.5);
        students[1] = new Student(102, "Rahul", 23, 85.0);
        students[2] = new Student(103, "Priya", 22, 91.5);
        students[3] = new Student(104, "Amit", 24, 78.0);
        students[4] = new Student(105, "Sneha", 22, 88.5);

        System.out.println("------------------------------------------------------------");
        System.out.println("RollNo  Name \tAge Marks");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < students.length; i++) {
            students[i].display();
        }
    }
}