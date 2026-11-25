import java.util.Scanner;

public class CountPrime {

	public static void main(String[] args) {
		int n;
		int nums[] = null;
		Scanner s = new Scanner(System.in); //keyboard as resource 
		//accept value of n
		System.out.println("How many numbers: ");
		n = s.nextInt();
		//create array 
		nums = new int[n];
		System.out.println("Enter "+ n+" integers");		
		for(int i=0; i<n; i++ ) {
				nums[i] = s.nextInt();
		}
		int count = 0;
		for(int i=0; i<n; i++ ) {
			// check whether nums[i] is prime or not
			int d = 2;
			for(; d < nums[i]; d++) {
				if(nums[i] % d == 0)
					break;
			}
			System.out.println(" d= "+d+" nums[i] = "+nums[i]);
			if(d >= nums[i])
				count++;
		}
		System.out.println("prime count: "+count);
		s.close();
	}

}
