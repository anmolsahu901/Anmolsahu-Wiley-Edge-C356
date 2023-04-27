package Wiley_Core_Java;

interface Person{
	public String getRole();
}

class Teacher implements Person{
	public String getRole() {
		return "teacher";
	}
}

interface Student extends Person{
	public String getRole();
}

class Classroom extends Teacher implements Student{
	public String getRole() {
		return "ClassRoom";
	}

}


public class A11DiamondProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher obj = new Classroom();
		System.out.println(obj.getRole());
	}

}
