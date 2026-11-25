public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int search = 30;

        int start = 0;
        int end = arr.length - 1;
        boolean found = false;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == search) {
                found = true;
                break;
            } 
            else if (search > arr[mid]) {
                start = mid + 1;
            } 
            else {
                end = mid - 1;
            }
        }

        if (found) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }
}