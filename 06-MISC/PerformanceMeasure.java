public class PerformanceMeasure {

	public static void main(String[] args) {
		int n=5; // number of students 
		double marks[] = {56, 67, 62, 87, 85}; 
		double sum = 0; 
		
		int index = 0;
		while(index < n){
			sum += marks[index];
			index++;
		}
		
		double avg = sum / n;
		System.out.println("average marks: "+avg);
		
		index = 0;
		while(index < n){
			System.out.print("marks "+marks[index]);
			if(marks[index] < avg)
				System.out.println(" is below average");
			else
				System.out.println(" is above average");
			
			index++;
		}
		

	}

}
