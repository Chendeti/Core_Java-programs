package Practice;

class Device{
	void display()
	{
		System.out.println("iam an electronic device");
	}
}

class TV extends Device{
	void display()
	{
		System.out.println("iam a tv");
		super.display();
	}
}

public class Super {

	public static void main(String[] args) {
		
		TV t=new TV();
		t.display();

		

	}

}
