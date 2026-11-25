import java.util.Scanner;

class Q9MultiplicationElementsArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter element: ");
            arr[i] = sc.nextInt();
        }

        int product = 1;

        for (int i = 0; i < 5; i++) {
            product *= arr[i];
        }

        System.out.println("Product = " + product);

        sc.close();
    }
}