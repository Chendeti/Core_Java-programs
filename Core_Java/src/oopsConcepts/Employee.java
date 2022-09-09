package oopsConcepts;

//inheritance example

public class Employee {
	
	float salary=30000;
	
}
   class programmer extends Employee {
	   
	   int bonus=16000;
	   

	public static void main(String[] args) {
		
		programmer p=new programmer();
		
		System.out.println("programmer salary is:"+p.salary);
		System.out.println("Bonus of programmer is:"+p.bonus);

		

	}

}
   
