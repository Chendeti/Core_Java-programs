package javafundamentals;

public class Operators {

	public static void main(String[] args) {
		
		int a=10;
		int b=10;
		int c=15;
		
	// Unary Operator
		
		System.out.println(a++);//10 (11) - PostIncrement
		
		System.out.println(++a);//12      - preIncrement
		
		System.out.println(a--);//12 (11) - postDecrement
		
		System.out.println(--a);//10      - preDecrement
		
		System.out.println(a++ + ++a);//10+12=22
		
		System.out.println(b++ + b++);//10+11=21
	
	// Arithematic Operators
			
		
		System.out.println(a+b);//24
		
		System.out.println(a-b);//0
		
		System.out.println(a*b);//144
		
		System.out.println(a/b);//1
		
		System.out.println(a%b);//0
		
		
    // Shift Operator
		
		System.out.println(10>>2);// 10/2^2=10/4=2
		
		System.out.println(10<<2);// 20*2^2=10*4=40
		
    // Relational Operator
		
		System.out.println(a>=b);//true
		
		System.out.println(a==b);//true
		
		System.out.println(a!=b);//false
		
    // Logical Operators
		
		System.out.println(a>b && a<c);// false , logical AND  return true if both conditions are true
		
		System.out.println(a>b || a<c);//true , logical OR return true if one condition is true
		
    // Bitwise Operator
		
		System.out.println(a|c);//15, either of bits is 1 it gives 1, else it gives 0.its a binary operator
		
		System.out.println(a&c);//12 , both bits are 1 it gives 1, else 0
		
		
		
		
		

	}

}
