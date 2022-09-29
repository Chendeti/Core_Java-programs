package collectionframework;
//different ways of adding, remove elements

import java.util.*;
public class LinkedList2 {

	public static void main(String[] args) {

		LinkedList<String> ll=new LinkedList<>();
		
		
		
		ll.add("Ravi");
		ll.add("Raju");
		ll.add("Vamsi");
		ll.add(2, "Anil");
		
		LinkedList<String> ll1=new LinkedList<>();
		ll1.add("Sonoo");
		ll1.add("Hem");
		
		ll.addAll(ll1);
		
		ll.addFirst("Mouni");
		
		ll.addLast("Harshi");
		
	//	ll.remove("Anil");
		
	//	ll.remove(0);
		
	//	ll.removeAll(ll1);
		
	//	ll.removeFirst();
		
		ll.removeLast();
		
		
		
		
		Iterator i=ll.descendingIterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}
