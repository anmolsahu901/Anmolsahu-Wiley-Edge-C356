package com.wiley.JDBCapplication;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchProcess {
	
	public static  void batch(String q1,String q2, String q3) {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			dBConnection dbc= new dBConnection();
			conn = dbc.createConnection();
			
			conn.setAutoCommit(false);
			
			st = conn.createStatement();
			
			st.addBatch(q1);
			st.addBatch(q2);
			st.addBatch(q3);
			
			int[] count = st.executeBatch();
			
			for(int c : count) {
				System.out.println(c);
			}
			
			conn.commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		String q1 = "SELECT * FROM candidates";
		String q2 = "SELECT * FROM candidate_skills";
		String q3 = "SELECT DISTINCT COUNT(*) FROM candidate_skills";
		
		batch(q1,q2,q3);
		
	}

}
