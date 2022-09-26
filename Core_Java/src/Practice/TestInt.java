package Practice;

interface Printable{
	//int a=20;
	void Print();
}

interface Showable{
	void Show();
}
public class TestInt implements Printable,Showable{
	public void Print() {
		System.out.println("print");
	}
	
	public void Show() {
		System.out.println("show");
	}

	public static void main(String[] args) {
		
		TestInt t=new TestInt();
		t.Print();
		t.Show();
	//	t.a=30;
	//	System.out.println(t.a);
		

		

	}

}
