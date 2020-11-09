package abc;

import java.util.ArrayList;
import java.util.List;

public class A1 {
public static void main(String[] args) {
	

List <String> list=new ArrayList<String>();
list.add("mon");
list.add(String::new);
list.add("tuesday");
list.remove(0);
System.out.println(list.get(0));

	}
}
