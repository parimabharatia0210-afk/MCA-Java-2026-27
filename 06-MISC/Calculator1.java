import java.util.Scanner;

public class Calculator1 {
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
		if(op==1) {
			result = n1 + n2;
		}else if (op==2) {
			result = n1 - n2;
		}else if (op==3) {
			result = n1 * n2;
		}else if (op==4) {
			result = n1 / n2;
		}else {
			System.out.println("Not a valid operation specified");//
		}
		System.out.println("Result = "+result );
		sc.close();
	}

}
