package abc;

import java.util.Scanner;


public class Abcd {
	public static void main(String[] args) {
		int a;
		int flag=0;
		Scanner sc =new Scanner(System.in);
		a=sc.nextInt();
		for(int i=2;i<a/2;i++){
			if(a%i==0){
				System.out.println("not prime");
				flag=1;
				
				break;
				
			}
			
			
		}
		
		if(flag==0){
			System.out.println("prime");
			}
		
		
		
		
	}
}