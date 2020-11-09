package def;

public class Employee {
	public int age;
	 public String name;
	public Employee(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + "]";
	}
	

}
