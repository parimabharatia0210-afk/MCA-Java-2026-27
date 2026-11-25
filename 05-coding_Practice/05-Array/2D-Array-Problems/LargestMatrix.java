public class LargestMatrix {
    public static void main(String[] args) {

        int[][] matrix = {
            {10, 25, 5},
            {40, 15, 30},
            {20, 50, 35}
        };

        int largest = matrix[0][0];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j] > largest) {
                    largest = matrix[i][j];
                }
            }
        }

        System.out.println("Largest element: " + largest);
    }
}