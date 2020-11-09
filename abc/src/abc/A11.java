package abc;

import java.util.Iterator;
import java.util.LinkedList;

public class A11 {
public static void main(String[] args) {
	LinkedList<String>list=new LinkedList<String>();
	list.add("Grapes of wrath");
	list.add("1984");
	list.stream().forEach(System.out::println);
	Iterator it=list.iterator();
	while(it.hasNext())
		System.out.println(it.next());
}
}
