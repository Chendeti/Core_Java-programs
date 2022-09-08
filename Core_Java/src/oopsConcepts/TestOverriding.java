package oopsConcepts;

//parent class
class Bank{
	
	int getRateOfInterest() {return 0;}
	
}

// child class

class SBI extends Bank{
	
	int getRateOfInterest() {return 8;}
	
}


class ICICI extends Bank{
	
	int getRateOfInterest() {return 7;}
	
}

class HDFC extends Bank{
	int gerRateOfInterest() {return 9;}
	
	
}
public class TestOverriding {

	public static void main(String[] args) {
		
		SBI s=new SBI();
		
		ICICI i=new ICICI();
		
		HDFC h=new HDFC();
		
		
		System.out.println("SBI Rate of Interest:"+s.getRateOfInterest());
		
		System.out.println("ICICI Rate of Interest:"+i.getRateOfInterest());
		
		System.out.println("HDFC Rate of Interest:"+h.gerRateOfInterest());
		
		

	}

}
