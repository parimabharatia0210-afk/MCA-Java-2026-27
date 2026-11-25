package Multithreading;
public class Prime{
    public static void main(String[] args) {
        int count = 0;

        for (int n = 2; n <= 100; n++) {

            

            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }

            if (count == 2) {
                // System.out.print(n + " ");
            }

            
        }
        System.out.println(count);
    }
}