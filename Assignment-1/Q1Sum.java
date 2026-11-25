import java.util.Scanner;

public class Q1Sum {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = s.nextInt();
        
        int sum = 0;

        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }

        System.out.println("Sum of digits is: " + sum);

        s.close();
    }
}