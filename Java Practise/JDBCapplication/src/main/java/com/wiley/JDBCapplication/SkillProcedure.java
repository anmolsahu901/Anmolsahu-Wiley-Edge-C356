package com.wiley.jdbcapp.util;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SkillProcedure {
	public static void getCandidateSkills(int candidateId) {
		Connection conn = null;
		ResultSet rs = null;
		CallableStatement cstmt = null;
		String q = "call get_candidate_skill(?)";
		
		try {
			dBConnection dbc= new dBConnection(); 
			conn = dbc.createConnection();
			
			cstmt = conn.prepareCall(q);
			cstmt.setInt(1, candidateId);
			
			rs = cstmt.executeQuery();
			
			while(rs.next()) {
				System.out.printf("%s - %s\n",
						rs.getString("first_name") + rs.getString("last_name"),
						rs.getString("skill"));
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		getCandidateSkills(133);
	}
}
