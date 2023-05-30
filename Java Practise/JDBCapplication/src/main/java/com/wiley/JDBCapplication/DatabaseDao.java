package com.wiley.JDBCapplication;

public interface DatabaseDao {
	
	public void createDb(String name);
	public void useDb(String name);
	
	public void dropDb(String name);
	public void createTable(String name);
	public void dropTable(String name);
	

}
