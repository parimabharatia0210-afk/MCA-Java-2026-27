public class RowColumnSum {
    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int i = 0; i < 3; i++) {
            int sum = 0;

            for (int j = 0; j < 3; j++) {
                sum = sum + matrix[i][j];
            }

            System.out.println("Sum of row " + (i + 1) + ": " + sum);
        }

        for (int j = 0; j < 3; j++) {
            int sum = 0;

            for (int i = 0; i < 3; i++) {
                sum = sum + matrix[i][j];
            }

            System.out.println("Sum of column " + (j + 1) + ": " + sum);
        }
    }
}