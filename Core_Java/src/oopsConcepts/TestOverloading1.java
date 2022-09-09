package oopsConcepts;

//method overloading changing no.of arguments

class Adder{
	
	static int add(int a,int b) {return a+b;}
	
	static int add(int a,int b,int c) {return a+b+c;}
	
}

public class TestOverloading1 {

	public static void main(String[] args) {
 System.out.println(Adder.add(8, 7));
 System.out.println(Adder.add(11, 11, 11));
		

	}

}
