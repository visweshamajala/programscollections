package def;

import java.util.ArrayList;
import java.util.Collections;

public class New {

public static void main(String args[]){  
	  
ArrayList<Employee> al=new ArrayList<Employee>();  
al.add(new Employee(31,"Vijay"));  
al.add(new Employee(36,"Ajay"));  
al.add(new Employee(25,"Jai"));  
  
System.out.println("Sorting by Name");  
  
Collections.sort(al,new Comp1());  
for(Employee em: al){  
System.out.println(em.name+" "+em.age);  
}  
  
System.out.println("Sorting by age");  
  
Collections.sort(al,new Comp());  
for(Employee em: al){  
System.out.println(em.name+" "+em.age);  
}  
}  
}
