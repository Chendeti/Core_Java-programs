package Practice;

// instance vs static method
import java.util.Scanner;

public class MinMax {
int I;
int S;

 void min(int a,int b)
{
	if(a>b)
		System.out.println(+a+"is max");
	else
		System.out.println(+b+"is max");
	
}
	public static void main(String[] args) {
		
		MinMax m1=new MinMax();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 no");
		int c=sc.nextInt();
		int d=sc.nextInt();
		m1.min(c,d);
				

		

	}

}
