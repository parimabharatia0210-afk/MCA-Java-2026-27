package Multithreading;

public class M1 {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;

            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false; 
                    break;           
                }
            }

            if (isPrime) {
                count++;
            }
        }
        
        System.out.println("Total prime numbers from 1 to 100: " + count);

        int count1 = 0;

        for (int i = 101; i <= 200; i++) {
            boolean isPrime = true;

            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false; 
                    break;           
                }
            }

            if (isPrime) {
                count1++;
            }
        }
        
        System.out.println("Total prime numbers from 101 to 200: " + count1);
    }
}
