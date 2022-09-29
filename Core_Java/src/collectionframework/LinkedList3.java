package collectionframework;
import java.util.*;

class Book{
	int id;
	String name,author,publisher;
	int quantity;
	
	public Book(int id, String name, String author, String publisher, int quantity) {
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
		
	}
}
public class LinkedList3 {

	public static void main(String[] args) {
		
		LinkedList<Book> list = new LinkedList<>(); //list of books
		
		Book b1= new Book(101, "Maths", "Bipin", "vajiram", 4);
		Book b2= new Book(112, "Physics", "Newton", "Ravi", 9);  
		Book b3= new Book(149, "English", "Lokesh", "RS",12);
		
		list.add(b1);
		list.add(b2);
		list.add(b3);
		
		
		
		for(Book b:list) {
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
		
		


	}

}
