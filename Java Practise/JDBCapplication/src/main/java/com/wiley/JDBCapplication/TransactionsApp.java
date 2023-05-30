package com.wiley.JDBCapplication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.util.Date;
import java.sql.Date;

public class TransactionsApp {

	public static void addCandidate(String fn, String ln, Date dob, String em, String
				ph, int[] skills) {
		
		Connection conn = null;
		PreparedStatement ps = null;
		PreparedStatement psSkill = null;
		ResultSet rs = null;
		
		try {
			conn =dBConnection.createConnection();
			
			conn.setAutoCommit(false);
			
			String sql = "Insert INTO candidates(first_name,last_name,"
					+ "dob, phone, email) VALUES(?,?,?,?,?)";
			
			ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			
			ps.setString(1, fn);
			ps.setString(2, ln);
			ps.setDate(3, dob);
			ps.setString(4, ph);
			ps.setString(5, em);
			
			int row = ps.executeUpdate();
			
			rs = ps.getGeneratedKeys();
			System.out.println("Generated Keys: "+rs);
			
			int id = 0;
			if(rs.next())
				id = rs.getInt(1);
			
			if(row ==1) {
				String sqlSkl = "INSERT INTO candidate_skills(candidate_id,skill_is) "
						+ "VALUES(?,?)";
				
				psSkill = conn.prepareStatement(sqlSkl);
				
				for(int sid : skills) {
					psSkill.setInt(1, id);
					psSkill.setInt(2, sid);
					
					psSkill.executeUpdate();
				}
				conn.commit();
			} else {
				conn.rollback();
			}
			
			
		} catch (SQLException e) {
			// TODO: handle exception
			try {
				if(conn != null)
					conn.rollback();
			} catch (SQLException e2) {
				// TODO: handle exception
				System.out.println(e2.getMessage());
			}
		} finally {
			try {
				if(rs != null) rs.close();
				if(ps != null) ps.close();
				if(psSkill != null) psSkill.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
				System.out.println(e2.getMessage());
			}
		}	
	}
	
	public static void main(String[] args) {
		int[] skills = {2,3,4,5};
		
		addCandidate("Raj", "Chourasia", Date.valueOf("2002-01-06"), "craj@gmail.com", "9109023424", skills);
	}
}
