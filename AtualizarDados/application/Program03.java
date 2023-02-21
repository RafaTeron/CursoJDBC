package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB01;

public class Program03 {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = DB01.getConnection();
	
			st = conn.prepareStatement(
					"UPDATE seller "
					+ "SET BaseSalary = BaseSalary + ? "
					+ "WHERE "
					+ "(DepartmentId = ?)");

			st.setDouble(1, 200.0);
			st.setInt(2, 2);
			
			int rowsAffected = st.executeUpdate();
			
			System.out.println("Done! Rows affected: " + rowsAffected);
		}
		catch (SQLException e) {
			e.printStackTrace();
		} 
		finally {
			DB01.closeStatement(st);
			DB01.closeConnection();
		}
	}
}
