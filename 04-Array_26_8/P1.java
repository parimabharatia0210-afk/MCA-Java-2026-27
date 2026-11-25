import java.util.Scanner;
public class P1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of elements: ");
		int a = sc.nextInt();

		System.out.println("Enter " + a + " elements: ");

		int arr[] = new int[a];

		for (int i = 0; i < a; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < a; i++){
			System.out.print(arr[i]+ " ");
		}
		sc.close();
	}
}
