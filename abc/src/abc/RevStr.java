package abc;

import java.util.Scanner;

public class RevStr {public static void main(String[] args) {
	System.out.println("enter str");
	Scanner sc = new Scanner(System.in);
	char[] a=sc.nextLine().toCharArray();
	for(int i=a.length-1;i>=0;i--){
		System.out.print(a[i]);
		
		
	}
	System.out.println("\n");
	
	
}

}
