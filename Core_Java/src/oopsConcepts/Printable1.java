package oopsConcepts;

//Multiple inheritance by interface

public interface Printable1 {
	void print1();
}

interface Showable{
	void show();
}

class A6 implements Printable1,Showable{
	public void print1() {System.out.println("Hello");}
	
	public void show() {System.out.println("Welcome");}
	
	public static void main(String[] args) {
		
		A6 obj=new A6();
		obj.print1();
		obj.show();
	}
	

}
