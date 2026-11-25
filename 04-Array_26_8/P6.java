import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};

        System.out.print("Enter element to remove: ");
        int n = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                break;
            }
        }

        System.out.print("Array: ");

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}