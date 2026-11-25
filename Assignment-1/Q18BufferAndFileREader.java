import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Q18BufferAndFileREader {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string to search: ");
        String searchString = sc.nextLine();

        FileReader fileReader = new FileReader("Myfile.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line  = bufferedReader.readLine();
        int totalOccurrences = 0;

        while (line != null) {
            if (line.contains(searchString)) {
                totalOccurrences++;
            }
            line = bufferedReader.readLine();
        }

        System.out.println("Total number of occurrences: " + totalOccurrences);

        bufferedReader.close();
        sc.close();
    }
}
