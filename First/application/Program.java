package application;

import java.sql.Connection;

import db.DB01;

public class Program {

	public static void main(String[] args) {
		
		Connection conn = null;
		DB01.closeConnection();
	}

}
