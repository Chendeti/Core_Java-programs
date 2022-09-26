package Practice;
//single inheritance

class Animal

{
	void printA()
	{
		System.out.println("animal is running");
	}
}


class Dog extends Animal{
	void printD()
	{
		System.out.println("Dog is barking");
	}
}

public class Test {

	public static void main(String[] args) {
		Dog d=new Dog();
		
		
		d.printA();
		d.printD();
		

		

	}

}
