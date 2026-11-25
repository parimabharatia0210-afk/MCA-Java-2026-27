package Assignment;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a > b){
			System.out.println("Diffrence: " + (a-b));
		}
		else{
			System.out.println("Addition: " + (a+b));
		}
		sc.close();
	}
}
