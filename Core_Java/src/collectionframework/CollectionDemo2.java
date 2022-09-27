package collectionframework;



import java.util.ArrayList;
import java.util.List;

public class CollectionDemo2 {

	public static void main(String[] args) {

List<String> al=new ArrayList<>();
		
		al.add("Vamsi");
		al.add("Anil");
		al.add("Lokesh");
		al.add("Raju");
		al.add(2, "Ravi");
		//al.add("Dinesh");

List<String> al1=new ArrayList<>();
		
		al1.add("Vamsi");
		al1.add("Anil");
		al1.add("Lokesh");
		al1.add("Raju");
		al1.add(2, "Ravi");
		
	//	System.out.println(al.equals(al1));
		
	//	System.out.println(al.isEmpty());
		
		System.out.println(al.lastIndexOf("Raju"));

	}

}
