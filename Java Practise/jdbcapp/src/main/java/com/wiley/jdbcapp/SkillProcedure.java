package com.wiley.jdbcapp;

import java.util.*;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SkillProcedure {

	public static void getCanditateSkills(int canditateId) {
		String query = "{call get_candidate_skill(?)}";
		Connection con = null;
		ResultSet rs = null;

		try {
			DBConnection dbcon = new DBConnection();
			con = dbcon.createDBConnection();

			CallableStatement cstmt = con.prepareCall(query);
			cstmt.setInt(1, canditateId);

			rs = cstmt.executeQuery();

			while(rs.next()) {
				System.out.println(
						String.format("%s - %s",
								rs.getString("first_name")+" "
										+ rs.getString("last_name"),rs.getString("skill")
								)
						);

			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());		}

	}

	
//	public static void batchProcessing() throws SQLException {
//		Connection conn = DBConnection.createDBConnection();
//		Statement st = conn.createStatement();
//
//		conn.setAutoCommit(false);
//		String q1 = "insert into Canditates values ("901","Anmol","Sahu","08-01-2001","803387432","anmol@gmail.com")";
//		
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		getCanditateSkills(137);
	}

}








