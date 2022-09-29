package collectionframework;

import java.util.ArrayList;
import java.util.List;

class Student{
	   int rollno;
	   String name, address;
	   
	   Student(int roolno, String name, String address){
		   this.rollno=rollno;
		   this.name=name;
		   this.address=address;
	   }
   }

public class CollectionDemo3 {

	public static void main(String[] args) {
		
		List<Student> list=new ArrayList<>();
		

		Student s1=new Student(1, "Vamsi", "Naidupet");
		Student s2=new Student(2, "Raju", "Nellore");
		Student s3=new Student(3, "Lokesh" ,"Sullurpet");
		Student s4=new Student(4, "Anil", "Hyderabad");

		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		
		for(Student s: list) {
			System.out.println(s.rollno+" "+s.name+" "+s.address);
		}
		

	}

}
