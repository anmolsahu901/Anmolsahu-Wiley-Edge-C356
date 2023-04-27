package Wiley_Core_Java;


class Employee{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}

class EmployeeImpl{
	public void show(Employee emp) {
		System.out.println("calling the show method");
		System.out.println("Name : "+ emp.getName()+"\nage: "+emp.getAge());

	}
}

public class B5EmployeeEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		
		emp.setName("Anmol");
		emp.setAge(22);
		
		System.out.println("Name : "+ emp.getName()+"\nage: "+emp.getAge());
		EmployeeImpl e = new EmployeeImpl();
				e.show(emp);
		
	}

}
