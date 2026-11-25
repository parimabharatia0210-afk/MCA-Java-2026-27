public class Frequency {
    public static void main(String[] args) {

        int[] arr = {10, 20, 10, 30, 20, 10};

        for (int i = 0; i < arr.length; i++) {

            int count = 0;
            boolean alreadyCounted = false;

            // Check if element was already counted
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (!alreadyCounted) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }

                System.out.println(arr[i] + " occurs " + count + " times");
            }
        }
    }
}