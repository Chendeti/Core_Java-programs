package collectionframework;

import java.util.*;


public class CollectionDemo {

	public static void main(String[] args) {

		List<String> al=new ArrayList<>();
		
		al.add("Vamsi");
		al.add("Anil");
		al.add("Lokesh");
		al.add("Raju");
		al.add(2, "Ravi");//add method with index and string
		//  al.add(25);
	//	al.add(3.14);
		
		ListIterator<String> itr = al.listIterator();
		System.out.println("In forward direction");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	//	System.out.println(al);
		
		
		System.out.println("In reverse direction");
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());

	}
		
		al.forEach(a->{
			System.out.println(a);
		});
		
	
}
}

