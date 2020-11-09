package abc;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		int i=1,j,num,num1;
	int bin[]=new int[100];
Scanner sc = new Scanner(System.in);
 num1=sc.nextInt();
 num=num1;
while(num!=0){
	 bin[i++]=num%2;
	
	num=num/2;
}
System.out.println(i);
for( j=i-1;j>0;j--){	

    System.out.print(bin[j]);

}
}
}