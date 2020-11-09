package abc;

import java.util.ArrayList;
import java.util.Collections;

 class Alist {
public static void main(String[] args) {
	ArrayList<String> alist=new ArrayList<String>();
	alist.add("A");
	alist.add("B");
	alist.add("C");
	alist.add("D");
	alist.add(2,"A");
	alist.add(4,"D");
	System.out.println(alist);
	alist.trimToSize(3);
	Collections.sort(alist);
	System.out.println(alist);
	
}

}
