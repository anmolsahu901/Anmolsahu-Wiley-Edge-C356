package com.wiley.JDBCapplication;

public interface EmployeeDao {
	
	public void createEmployee(Employee emp) ;
	public void getAllEmployee();
	public void getEmployeeById(int id);
	public void updateEmployeeById(int id, String name);
	public void deleteEmployeeById(int id);
	public void sortSalary(int i);
	public void searchEmployeeByName(String name);
	
}