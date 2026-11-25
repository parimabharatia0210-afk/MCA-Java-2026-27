package Assignment;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		int sum = 0,index = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of students: ");
		int n = sc.nextInt();
		System.out.println("Enter marks of " +n+ " students: ");
		int[] no = new int[n];
		while (index < n) {
            no[index] = sc.nextInt();
			sum += no[index];
			index++;
		}
		double avg = (double)sum/n;
		System.out.println("Average: " +avg);
		sc.close();
	}
}
