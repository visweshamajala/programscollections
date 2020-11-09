package abc;

import java.util.HashSet;
import java.util.Set;

public class Practice {
	public static void main(String[] args) {
		String s1="Flp";
		String s2=new String("Flp");
		
		Set setObj=new HashSet();
		setObj.add(s1);
		setObj.add(s2);
		
		System.out.println(setObj.size());
	}

}
