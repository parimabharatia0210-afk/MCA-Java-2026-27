package Assignment;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		float sum = 0, avg = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements: ");
		int n = sc.nextInt();
		System.out.println("Enter elements: ");
		for(float i = 0; i < n; i++) {
			float no = sc.nextInt();
			System.out.println(no);
			sum += no;
			avg = sum/n;
		}
		System.out.println("The Average is: " + avg);
		sc.close();
	}

}
