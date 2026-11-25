public class MatrixSubtraction {
    public static void main(String[] args) {

        int[][] a = {
            {10, 20},
            {30, 40}
        };

        int[][] b = {
            {5, 6},
            {7, 8}
        };

        int[][] result = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }

        System.out.println("Subtraction of matrices:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}