package com.wiley.jdbcapp;



public interface EmployeeDao {

	
	//create employee
	public void createEmployee(Employee emp);
	
	//show all employees
	public void getAllEmployee();
	
	//show employee based on id
	public void getEmpById(int id);
	
	//update employee by id
	public void updateEmpNameById(int id,String name);
	
	// delete employee
	public void deleteEmpById(int id);
	
	
}
