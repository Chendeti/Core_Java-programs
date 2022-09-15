package oopsConcepts;


abstract class Shape1{

abstract void draw();

}

class Triangle1 extends Shape1{
	void draw() {System.out.println("drawing triangle1");}
	
}

class Circle1 extends Shape1{
	
	void draw() {System.out.println("drawing circle1");}
	
}

public class TestAbstraction {

	public static void main(String[] args) {
		
	
		
		Shape1 s=new Circle1();
		
		s.draw();
		
	}

		

	}


