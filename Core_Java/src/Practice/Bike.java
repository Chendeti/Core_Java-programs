package Practice;



public class Bike {
	
	static int wheels=2;
	String color="";

	static void braking()
	{
		System.out.println("bike halts when brakes applied");
		
		
	}
	
	void mileage(int s)
	{
		System.out.println("mileage is "+s +"kmph");
	}
	public static void main(String[] args) {
		
		Bike RoyalEnfield = new Bike();
		Bike R15 = new Bike();
		Bike Duke = new Bike();
		
		System.out.println(""+RoyalEnfield.wheels);
		System.out.println(""+R15.wheels);
		System.out.println(""+Duke.wheels);
		
   RoyalEnfield.color="black";
   R15.color="blue";
   Duke.color="orange";
   
   System.out.println(""+RoyalEnfield.color);
	System.out.println(""+R15.color);
	System.out.println(""+Duke.color);
	
	RoyalEnfield.braking();
	R15.braking();
	Duke.braking();
	
	
	RoyalEnfield.mileage(40);
	R15.mileage(35);
	Duke.mileage(45);
	

		
		}

}
