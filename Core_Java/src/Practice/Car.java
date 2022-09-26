package Practice;

abstract class parts
{
	String n;
	parts(String n)
	{
		this.n=n;
	}
	abstract void function();
	void fun()
	{
		System.out.println(n);
	}
}

class Brakes extends parts
{
	String n;
	Brakes(String n)
	{
		super(n);
	}
	void function()
	{
		System.out.println("car shd be halted");
	}
}
class Accelerator extends parts
{
	String n;
	Accelerator(String n)
	{
		super(n);
	}
	void function()
	{
		System.out.println("car is accelerating");
	}
}

class Gear extends parts
{
	String n;
	int ge;
	Gear(String n,int ge)
	{
		super(n);
		this.ge=ge;
	}
	void function()
	{
		System.out.println("car shd be changed");
	}
	
}
public class Car {

	public static void main(String[] args) {
		Brakes b= new Brakes("Brakes");b.function();
	
		Accelerator a=new Accelerator("Accelerator");a.function();
		b.fun();
		Gear g=new Gear("Gear", 5);g.function();

		

	}

}
