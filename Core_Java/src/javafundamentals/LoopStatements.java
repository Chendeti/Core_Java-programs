package javafundamentals;

public class LoopStatements {

	public static void main(String[] args) {
		
		int i=0;

  // while loop
		
		while(i<=5) {
		System.out.println("the number is"+i);
		i++;
			
   // for loop
			
			int sum =0;
			for(int a=1; a<=5; a++) {
				sum = a+sum;
				System.out.println("the sum of first 5 natural no's is"+sum);
				
	// do while loop
				int b =6;
				do
				{
					System.out.println("the number is "+b);
					b++;
				} while (b<=5);
				}
				
			
		}
	}
}

	




