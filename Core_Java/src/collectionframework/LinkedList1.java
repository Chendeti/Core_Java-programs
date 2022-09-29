package collectionframework;

import java.util.*;

public class LinkedList1 {

	public static void main(String[] args) {
		
		LinkedList<String> al=new LinkedList<>();
		
		al.add("Vamsi");
		al.add("Lokesh");
		al.add("Ravi");
		al.add("Raju");
		
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		

	}

}
