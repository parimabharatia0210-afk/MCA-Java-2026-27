import java.util.Scanner;

public class Q3PositiveNegativeZero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an number: ");
        int n = sc.nextInt();

        if (n > 0)
            System.out.println("Positive");
        else if (n < 0)
            System.out.println("Negative");
        else 
            System.out.println("Zero");
        
        sc.close();
    }
}
