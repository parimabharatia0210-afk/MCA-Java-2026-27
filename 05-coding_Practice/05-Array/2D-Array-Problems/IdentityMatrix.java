public class IdentityMatrix {
    public static void main(String[] args) {

        int[][] matrix = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };

        boolean identity = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (i == j && matrix[i][j] != 1) {
                    identity = false;
                }

                if (i != j && matrix[i][j] != 0) {
                    identity = false;
                }
            }
        }

        if (identity) {
            System.out.println("Identity Matrix");
        } else {
            System.out.println("Not an Identity Matrix");
        }
    }
}