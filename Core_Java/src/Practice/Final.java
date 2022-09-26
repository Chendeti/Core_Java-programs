package Practice;

//final keyword used in variable,method,class

class F{
	void fun()
	{
		System.out.println("hello");
	}
}


public class Final extends F {
	
	final int a=10;
	
	void fun()
	{
		System.out.println("hii");
	}

	public static void main(String[] args) {
		F f=new Final();
		f.fun();
		
	//	f.a=20;
	//	System.out.println(f.a);

		

	}

}
