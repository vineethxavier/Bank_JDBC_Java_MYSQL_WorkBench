package com.Bank.Application.dom;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BankRepository {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/hw4imcs";
		String userName = "root";
		String password = "";
		//String query = "select empName,phNo from employee";
		String query = "select * from patron";
		
		//Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, userName, password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);

		int count =1;
		while(rs.next()) {
		
			String name = rs.getString(2);
			int phNo = rs.getInt(1);
			System.out.println(count++ +" "+name+" : "+phNo);
		}
		st.close();
		con.close();
	}//main

}//class BankRepository
