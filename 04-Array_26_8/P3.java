import java.util.Arrays;
public class P3 {

	public static void main(String[] args) {
		int[] numbers = {15, 3, 9, 1, 7};

        Arrays.sort(numbers); // Sorts in ascending order        
        
        System.out.println("Sorted Numbers: " + Arrays.toString(numbers));        
        // 2. Sorting a String Array
        
        String[] fruits = {"Banana", "Apple", "Cherry", "Mango"};
        
        Arrays.sort(fruits); // Sorts alphabetically (case-sensitive)
        
        System.out.println("Sorted Strings: " + Arrays.toString(fruits));
	}
}
