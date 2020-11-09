package abc;

import java.util.ArrayList;
import java.util.*;

public class Ex10 {
	public static void main(String[] args) {
		

		List  list=new ArrayList(1);
		list.add(1);
		list.add("A");
		list.add(new Integer(5));
		
		System.out.print(list);
//		for(int i=0;i<list.size();i++){
//			System.out.println(list.get(i));
//		}
	
			
		list.forEach(a->{
			System.out.println(a);
		});

			}
}
