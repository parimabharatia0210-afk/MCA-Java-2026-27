import java.util.Scanner;

public class ArrayMatrixAddition3D {
	static void printMatrix(double m[][]) {
		//for rows 
		for(int i=0; i<m.length; i++) {
			//for columns
			for(int j=0; j<m[i].length; j++)
				System.out.print(m[i][j]+"  ");
			
			System.out.println();				
		}
	}
	
	public static void main(String[] args) {
		double matrix1[][], matrix2[][], matrix3[][];
		int m=3;
		int n=3;
		matrix1 = new double[m][n];
		matrix2 = new double[m][n];
		matrix3 = new double[m][n];
		Scanner sc = new Scanner(System.in);
		
		//store values in matrix
		System.out.println("enter 9 values for matrix1 ");
		for(int i=0; i<matrix1.length; i++) {
			//for columns
			for(int j=0; j<matrix1[i].length; j++)
				matrix1[i][j] = sc.nextDouble();				
		}
		System.out.println("Matrix1");
		printMatrix(matrix1);
		
		System.out.println("enter 9 values for matrix2 ");
		for(int i=0; i<matrix2.length; i++) {
			//for columns
			for(int j=0; j<matrix2[i].length; j++)
				matrix2[i][j] = sc.nextDouble();				
		}
		System.out.println("Matrix2");		
		printMatrix(matrix2);
		
		//addition
		for(int i=0; i<matrix3.length; i++) {
			//for columns
			for(int j=0; j<matrix3[i].length; j++)
				matrix3[i][j] = matrix1[i][j] + matrix2[i][j];				
		}
		
		
		System.out.println("Matrix3");		
		printMatrix(matrix3);
		sc.close();	
	}

}
