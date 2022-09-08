package oopsConcepts;

// java interface example
public interface printable {
	
	void print();
	

}

class A3 implements printable{
	public void print() {System.out.println("Hello");}
	
	
	public static void main(String args[]) {
		
		A3 obj = new A3();
		obj.print();
	}
	
}
