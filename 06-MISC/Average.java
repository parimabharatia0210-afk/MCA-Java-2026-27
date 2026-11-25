import java.util.Scanner;

/*
  set  
     n = 10 // total number to be read 
     sum = 0 avg = 0 // initial value of sum and average
     counter =  0 / used to count numbers read  
     curNum = 0 // where current number is stored
     
     while counter < n:
         curNum = read_number()
         sum = sum + curNum
         counter =counter + 1
             
     avg = sum / n
     display avg
     
 */
public class Average {

	public static void main(String[] args) {
		int n, sum = 0, avg = 0;
		int counter;
		
		//create a scanner to read numbers
		Scanner s = new Scanner(System.in); 
		//how many numbers
		System.out.println("how many students marks: ");
		n = s.nextInt();
		
		System.out.println("Enter "+n+" students marks");
		
		counter = 0; // loop counter initialization
		while( counter< n)
		{
			int curNum  = s.nextInt();
			sum = sum + curNum;
			counter = counter + 1; // loop counter update
		}
		//calculate average 
		avg = sum / n;
		System.out.println("Average = "+avg);
		s.close();
	}

}
