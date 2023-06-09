package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GeniusStudent implements Comparable<GeniusStudent>{
	public GeniusStudent(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		Salary = salary;
	}


	private int id;
	private String name;
	private int Salary;


	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	@Override
	public String toString() {
		return "GeniusStudent [id=" + id + ", name=" + name + "]";
	}

	public GeniusStudent(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GeniusStudent other = (GeniusStudent) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public int compareTo(GeniusStudent that) {

		if(this.id == that.id)
			return 0;
		else if(this.id >that.id)
			return 1;
		else
			return -1;

	}


	public static void main(String[] args) {
		List<GeniusStudent> l1 = new ArrayList<GeniusStudent>();
		l1.add(new GeniusStudent(45,"Anmol",8900));
		l1.add(new GeniusStudent(89,"Aman",20000));
		l1.add(new GeniusStudent(23,"Aanshi",7000));
		l1.add(new GeniusStudent(21,"Mansi",10000));
		l1.add(new GeniusStudent(21,"rishav",19000));

		
		
//		Collections.sort(l1,comStudent);
		// using comparable : give power to class to compare itself ! 
		Collections.sort(l1,new IdComparator());
		System.out.println(l1);
	}


}











