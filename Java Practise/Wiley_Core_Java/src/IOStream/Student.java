package IOStream;

public class Student{
	public Student(int age, String name, boolean gender, float grade) {

		this.age = age;
		this.name = name;
		this.gender = gender;
		this.grade = grade;
	}
	private	int age;
	private String name;
	private float grade;
	private boolean gender;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public boolean getGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public float getGrade() {
		return grade;
	}
	public void setGrade(float grade) {
		this.grade = grade;
	}
	
}