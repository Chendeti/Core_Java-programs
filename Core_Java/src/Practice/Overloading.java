package Practice;

public class Overloading {
	
	static int addition(int a,int b)
	{
		return a+b;
	}
	static int addition(int a,int b,int c)
	{
		return a+b+c;
	}
	static double addition(double a,double b, int c)
	{
		return a+b+c;
	}

	public static void main(String[] args) {
		
		System.out.println(addition(12,13,14));
		System.out.println(addition(12.3,13.7,14));
		System.out.println(addition(20,40));

		

	}

}
