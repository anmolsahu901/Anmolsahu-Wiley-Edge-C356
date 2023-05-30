package com.wiley.SpringCore.A1;

import java.util.ArrayList;
import java.util.HashMap;


public class Student {
	private int studentId;
	private String studentName;
	private String studentAddress;
	private ArrayList<String> course;
	private  HashMap<Integer,String> phone;
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentId, String studentName, String studentAddress, ArrayList<String> course) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.course = course;
	}
	
	
	public Student(int studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.course = new ArrayList<String>();
		
		
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public ArrayList<String> getCourse() {
		return course;
	}
	public void setCourse(ArrayList<String> course) {
		this.course = course;
	}
	
	
	
public HashMap<Integer, String> getPhone() {
		return phone;
	}
	public void setPhone(HashMap<Integer, String> phone) {
		this.phone = phone;
	}
	//	@Override
//	public String toString() {
//		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
//				+ ", course=" + course + "]";
//	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ ", course=" + course + ", phone=" + phone + "]";
	}
	
	
	
}
