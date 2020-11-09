package abc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pro {
	public static void main(String[] args) {
		List<String> al=new ArrayList<String>();
		al.add("B");al.add("C");al.add("A");
		System.out.print(al.indexOf("C"));
		Collections.reverse(al);
		System.out.print(""+al.indexOf("D"));
		Collections.sort(al);
		System.out.println(""+al.indexOf("A"));
	}

}
