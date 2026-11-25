import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        // Copy elements from arr1 to arr2
        for (int i = 0; i < n; i++) {
            arr2[i] = arr1[i];
        }

        System.out.println("Original Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println("\nCopied Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }

        sc.close();
    }
}