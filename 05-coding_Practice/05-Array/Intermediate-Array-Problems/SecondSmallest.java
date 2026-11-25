public class SecondSmallest {
    public static void main(String[] args) {

        int[] arr = {10, 50, 30, 40, 20};

        int smallest = arr[0];
        int second = arr[1];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                second = smallest;
                smallest = arr[i];
            } else if (arr[i] < second && arr[i] != smallest) {
                second = arr[i];
            }
        }

        System.out.println("Second smallest element: " + second);
    }
}