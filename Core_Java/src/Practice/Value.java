package Practice;
//call by value

public class Value {
	int a;
	int b;

private static void add(int s, int t) {

     s=10;
     
     System.out.println("Result from method: " +(s+t));
}

	public static void main(String[] args) {

	Value op=new Value();
	op.a=2; op.b=3;
	
	System.out.println("before passing: " +(op.a+op.b));
	add(op.a,op.b);
	System.out.println("after passing: " +(op.a+op.b));

	}

}
