package collectionframework;
//add value from one list to other
import java.util.ArrayList;
import java.util.List;

public class CollectionDemo1 {

	public static void main(String[] args) {

List<String> al=new ArrayList<>();
		
		al.add("Vamsi");
		al.add("Anil");
		al.add("Lokesh");
		al.add("Raju");
		al.add(2, "Ravi");
		
List<String> al1=new ArrayList<>();

       al1.add("Mounika");
    //   al1.clear();
       al1.add("Bharathi");
       al1.add("Harshi");
       
       al1.addAll(al);
       
    //   al1.clear();
       
       
      for(String s:al) {
    	  System.out.println(s);
      }
      System.out.println();
      for(String x:al1) {
    	  System.out.println(x);
      }

	}

}
