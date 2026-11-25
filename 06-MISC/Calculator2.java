import java.util.Scanner;

public class Calculator2 {
	public static void main(String args[]) {
		double n1, n2;
		double result = 0;
		int op;//operation 
		Scanner sc = new Scanner(System.in);
		
		//read two numbers
		System.out.println("Entter two numbers: ");
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		System.out.println("Which operation to be carried out");
		System.out.println(" 1. Addition");
		System.out.println(" 2. Subtarction");
		System.out.println(" 3. Multillecation");
		System.out.println(" 4. Division");
		op = sc.nextInt();
		switch (op) {
			default:
				System.out.println("Not a valid operation specified");
				break;
			case 1: 
				result = n1 + n2;
				System.out.println("addition");
				break;
			case 2: 
				result = n1 - n2;
				System.out.println("subtracion");
			case 3: 
				result = n1 * n2;
				System.out.println("multipletion");
			case 4: 
				result = n1 / n2;	
				System.out.println("divison");
			
		}
		
		System.out.println("Result = "+result );
		sc.close();
	}

}
