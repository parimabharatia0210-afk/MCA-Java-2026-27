import java.util.Scanner;

class Q6FirstLastDigitDisplay {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        
        int num = sc.nextInt();
        
        int first = num;
        
        while (first >= 10)
            first /= 10;
        
        int last = num % 10;
        
        System.out.println("First digit: " + first);
        
        System.out.println("Last digit: " + last);
        
        sc.close();
    }
}