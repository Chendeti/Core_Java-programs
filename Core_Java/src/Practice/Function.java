package Practice;

//Instance vs static variable

public class Function {
	
	int I=10;
	static int S=20;
	
	void printValue()
	{
		System.out.println(""+I); // simple method to access instance variable 
	}
	

	public static void main(String[] args) {
		
		Function f1=new Function();
		System.out.println(""+f1.I);
		System.out.println(""+S);
		System.out.println(""+Function.S);
		System.out.println(""+f1.S);
		
		f1.printValue();
		
		

	}

}
