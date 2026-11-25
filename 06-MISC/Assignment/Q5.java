package Assignment;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elements: ");
		int no = sc.nextInt();
		System.out.println("Enter "+ no + " elements: ");
		int[] arr = new int[no];
		for(int i = 0; i < no; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Prime numbers are: ");
		for (int i = 0; i < no; i++) {
			int count = 0;
			for(int j = 1; j <= arr[i]; j++) {
				if(arr[i] % j == 0) {
					count++;
				}
			}
			if(count == 2) {
				System.out.println(arr[i] + " ");
			}
		}
		sc.close();
	}
}
