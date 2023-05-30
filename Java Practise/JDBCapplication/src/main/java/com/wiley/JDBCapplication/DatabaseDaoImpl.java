package com.wiley.JDBCapplication;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DatabaseDaoImpl implements DatabaseDao{
	static Connection conn = MysqlConnection.createConnection();
	
	public void createDb(String name) {
		String q = "create DATABASE "+name;
		
		try {
			
			PreparedStatement ps = conn.prepareStatement(q);
			int count = ps.executeUpdate();
			if(count != 0) {
				System.out.println("DB created!!!!!!!");
			}
			ps.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	public void useDb(String name) {
		String q = "use "+name;
		
		try {
			
			PreparedStatement ps = conn.prepareStatement(q);
			int count = ps.executeUpdate();
			if(count != 0) {
				System.out.println("USING DB "+name+"!!!!!!!");
			}
			ps.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	public void dropDb(String name) {
		String q = "DROP DATABASE "+name;
		
		try {
			
			PreparedStatement ps = conn.prepareStatement(q);
			int count = ps.executeUpdate();
			if(count != 0) {
				System.out.println("DROPPED DB "+name+"!!!!!!!");
			}
			ps.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	public void createTable(String name) {
		String q = "CREATE TABLE "+name;
		
		try {
			
			PreparedStatement ps = conn.prepareStatement(q);
			int count = ps.executeUpdate();
			if(count != 0) {
				System.out.println("TABLE created "+name+"!!!!!!!");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	public void dropTable(String name) {
		String q = "DROP TABLE "+name;
		
		try {
			
			PreparedStatement ps = conn.prepareStatement(q);
			int count = ps.executeUpdate();
			if(count != 0) {
				System.out.println("Table deleted "+name+"!!!!!!!");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
