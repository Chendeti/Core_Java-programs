package oopsConcepts;

//abstract class example

abstract class Bank2{
	abstract int getRateOfInterest();
	
}

class KOTAK extends Bank2{
	int getRateOfInterest() {return 6;}
	
}

class KARUR extends Bank2{
	int getRateOfInterest() {return 8;}
	
}
public class TestBank {

	public static void main(String[] args) {
		
		Bank2 b;
		b=new KOTAK();
		System.out.println("Rate Of Interest is:"+b.getRateOfInterest()+"%");
		
		b=new KARUR();
		System.out.println("Rate Of Interest is:"+b.getRateOfInterest()+"%");


	}

}
