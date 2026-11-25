public class ArrayDemo2 {
	static void printArray(int data[][]) {
		// loop for rows
		for (int row = 0; row < data.length; row++) {
			// loop for columns
			for (int col = 0; col < data[row].length; col++)
				System.out.print(data[row][col] + " ");

			// this is first for loop
			System.out.print("\n");
		}
	}

	public static void main(String[] args) {
		int data[][] = { { 1, 2, 3, 11 },
				{ 4, 5, 6, 21 },
				{ 7, 8, 9, 31 }
		};
		data = new int[3][3]; // dynamic 2-D array
		// accept values
		// System.out.println("Enter values");
		for (int row = 0; row < data.length; row++) {
			// loop for columns
			for (int col = 0; col < data[row].length; col++)
				data[row][col] = (int) (Math.random() * 200);

		}

		// print an array
		printArray(data);

	}

}
