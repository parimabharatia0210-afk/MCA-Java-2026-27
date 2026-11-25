public class Q20FindMax {

    public static <T extends Comparable<T>> T findMaximum(T[] arr) {
        T t = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(t) > 0) {
                t = arr[i];
            }
        }

        return t;
    }

    public static void main(String[] args) {
        Integer[] numbers = {10, 25, 5, 40, 15};
        System.out.println("Maximum Integer: " + findMaximum(numbers));

        Double[] decimals = {10.5, 25.7, 5.2, 40.8, 15.3};
        System.out.println("Maximum Double: " + findMaximum(decimals));

        String[] names = {"Apple", "Mango", "Banana", "Orange"};
        System.out.println("Maximum String: " + findMaximum(names));
    }
}