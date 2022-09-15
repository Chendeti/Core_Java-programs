package oopsConcepts;

//interface example

interface Bank1{
	
	float rateOfInterest();
	
	
}

class PNB implements Bank1{
	public float rateOfInterest() {return 9.43f;}
		
}

class AXIS implements Bank1{
	public float rateOfInterest() {return 8.7f;}
	
	
}
public class TestInterface {

	public static void main(String[] args) {

		Bank1 b =new PNB();
		
		System.out.println("ROI:"+b.rateOfInterest());
		
		

	}

}
