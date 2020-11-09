package abc;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {
	public static void main(String[] args) {
		List sample = new ArrayList();
		String s ="foo";
		sample.add("String");
		sample.add(s);
		sample.add(s+s);
		System.out.println(sample.size());
		System.out.println(sample.contains(87));
		System.out.println(sample.contains("foofoo") );
		sample.remove(2); 
		System.out.println(sample.size());
		
	}

}
