package abc;

import java.util.LinkedList;
import java.util.stream.Stream;

public class A18 {
	public static void main(String[] args) {
		
	
	LinkedList<String>list=new LinkedList<String>();
	list.add("Archie");
	list.add("X-men");
	Stream <String>s=list.stream();
	s.forEach(System.out::println);
	s.forEach(System.out::println);
}
}