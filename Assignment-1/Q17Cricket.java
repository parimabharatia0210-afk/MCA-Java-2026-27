import java.util.Scanner;

class NoBallException extends Exception {
}

public class Q17Cricket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int runs, total = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.print("Enter runs: ");
            runs = sc.nextInt();

            try {
                if (runs == -1) {
                    throw new NoBallException();
                }
                total = total + runs;
            } catch (NoBallException e) {
                System.out.println("No Ball! Extra 1 run.");
                total = total + 1;
            }
        }

        System.out.println("Total runs: " + total);
        sc.close();
    }
}