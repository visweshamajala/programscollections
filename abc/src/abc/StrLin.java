package abc;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class StrLin {
	public static void main(String[] args) {
		
	
	List<String> list =new LinkedList<String>();
	list.add("archie");
	list.add("xmen");
	Stream <String> s=list.stream();
	s.forEach(System.out::println);
	s.forEach(System.out::println);

}
}