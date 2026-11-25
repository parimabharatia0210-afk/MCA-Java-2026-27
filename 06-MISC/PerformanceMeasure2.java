import java.util.Scanner;

public class PerformanceMeasure2 {

	public static void main(String[] args) {
		int n = 5; // number of students
		double marks[]; // = { , 67, 62, 87, 85};
		Scanner sc = null;
		sc = new Scanner(System.in);
		System.out.println("How many students: ");
		n = sc.nextInt();

		// create array dynamically
		marks = new double[n];

		double sum = 0, avg;
		int index;

		System.out.println("Enter marks of " + n + " students");
		for (index = 0; index < n; index += 1) {
			marks[index] = sc.nextDouble();
			sum += marks[index];
		}

		avg = sum / n;
		System.out.println("average marks: " + avg);

		for (index = 0; index < n; index += 1) {
			System.out.print("marks " + marks[index]);
			if (marks[index] < avg)
				System.out.println(" is below average");
			else
				System.out.println(" is above average");

		}
		sc.close();
	}

}
