import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        int total = 0;
        int highest;
        int lowest;
        int passed = 0;
        int failed = 0;

        System.out.println("Enter marks:");

        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        highest = marks[0];
        lowest = marks[0];

        for (int i = 0; i < n; i++) {

            total = total + marks[i];

            if (marks[i] > highest) {
                highest = marks[i];
            }

            if (marks[i] < lowest) {
                lowest = marks[i];
            }

            if (marks[i] >= 40) {
                passed++;
            } else {
                failed++;
            }
        }

        double average = (double) total / n;

        System.out.println("\nTotal marks: " + total);
        System.out.println("Average marks: " + average);
        System.out.println("Highest marks: " + highest);
        System.out.println("Lowest marks: " + lowest);
        System.out.println("Students passed: " + passed);
        System.out.println("Students failed: " + failed);

        System.out.println("\nGrades:");

        for (int i = 0; i < n; i++) {

            if (marks[i] >= 90) {
                System.out.println("Student " + (i + 1) + ": A");
            } else if (marks[i] >= 75) {
                System.out.println("Student " + (i + 1) + ": B");
            } else if (marks[i] >= 60) {
                System.out.println("Student " + (i + 1) + ": C");
            } else if (marks[i] >= 40) {
                System.out.println("Student " + (i + 1) + ": D");
            } else {
                System.out.println("Student " + (i + 1) + ": F");
            }
        }
        sc.close();
    }
}