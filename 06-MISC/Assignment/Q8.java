package Assignment;

import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = 2, n = 2;
        int matrix1[][] = new int[m][n];
        int matrix2[][] = new int[m][n];
        int matrix3[][] = new int[m][n];
        System.out.println("Enter values for matrix 1:");
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter values for matrix 2:");
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++){
            	for(int k = 0; k < n; k ++) {
                matrix3[i][j] = matrix3[i][j] + matrix1[i][k] * matrix2[k][j];
            	}
            }
        }
        System.out.println("Multiplication is:");
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}