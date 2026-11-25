public class Synchronnization1 {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void printArray(int[] arr, int size) {
        System.out.print("Prime numbers: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Synchronization sync = new Synchronization(50);
        int m = 10;
        int n = 50;
        for(int i = m; i <= n; i++){
            if(isPrime(i)){
                sync.putElement(i);
            }
        }
        sync.printArray();
    }
}
