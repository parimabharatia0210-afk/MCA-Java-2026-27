import java.util.Scanner;

public class Q23ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int a = Integer.parseInt(sc.next());

            System.out.print("Enter second number: ");
            int b = Integer.parseInt(sc.next());

            int[] arr = {10, 20, 30, 40, 50};

            System.out.print("Enter array index: ");
            int index = Integer.parseInt(sc.next());

            System.out.println("Division: " + (a / b));
            System.out.println("Array element: " + arr[index]);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");

        } catch (NumberFormatException e) {
            System.out.println("Please enter valid integers.");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index.");
        }

        sc.close();
    }
}