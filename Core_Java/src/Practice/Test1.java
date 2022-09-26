package Practice;
//multileval inheritance

class Animal1

{
	void printA()
	{
		System.out.println("animal is running");
	}
}


class Dog1 extends Animal{
	void printD()
	{
		System.out.println("Dog is barking");
	}
}

class Labradors extends Dog1
{
	void printL()
	{
		System.out.println("Lab is in brown color");
	}
}

public class Test1 {

	public static void main(String[] args) {
		
		Labradors L =new Labradors();
		L.printA();
		L.printD();
		L.printL();

		

	}

}
