package Assignment;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three Numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a>b) {
			if(a>c) {
				System.out.println("The larger number is" + a);	
			}
		}
		else if (b>c){
			if(b>a) {
				System.out.println("The larger number is" + b);
			}			
		}
		else {
			System.out.println("The larger number is " + c);
		}
		sc.close();
	}
}
