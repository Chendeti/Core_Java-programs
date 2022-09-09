package oopsConcepts;

public class Bike2 {
	
	void run() {System.out.println("running");}
	
	
	}

class pulsar extends Bike2{
	void run() {System.out.println("running safely with 50km");}
	

	public static void main(String[] args) {
		
		Bike2 b=new pulsar();//upcasting
		
		b.run();
		

		

	}

}
