package Practice;

//Hierarical

class Animal2

{
	void printA()
	{
		System.out.println("animal is running");
	}
}


class Dog2 extends Animal{
	void printD()
	{
		System.out.println("Dog is barking");
	}
}

class Cat extends Animal
{
	void printC()
	{
		System.out.println("cat sayd meow");
	}
}

public class Test2 {

	public static void main(String[] args) {
 
		Dog d=new Dog();
		Cat c =new Cat();
		
		d.printA();
		d.printD();
		c.printC();
		c.printA();

	}

}
