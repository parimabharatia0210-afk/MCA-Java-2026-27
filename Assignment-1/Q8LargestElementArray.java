import java.util.Scanner;

class Q8LargestElementArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter element: ");
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];

        for (int i = 1; i < 5; i++) {
            if (arr[i] > largest)
                largest = arr[i];
        }

        System.out.println("Largest element = " + largest);

        sc.close();
    }
}