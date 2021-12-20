package mysql.level1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectEmp {
	public static void main(String args[]) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException cnfe){
			System.out.println("�ش� Ŭ������ ã�� �� �����ϴ�. "+ cnfe.getMessage());
			return;
		}
		
		String url = "jdbc:mysql://localhost:3306/sqldb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "root";
		String passwd = "1234";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {	
			conn = DriverManager.getConnection(url, user, passwd);
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select ename, sal, hiredate from emp");
			while(rs.next()){
				System.out.println(rs.getString("ename")+","+rs.getDate("hiredate")+","+rs.getInt("sal"));
			}
		} catch (SQLException se1) {
			System.out.println(se1.getMessage());
		}finally {
			try {
				if(rs != null) rs.close();
				if(stmt!= null) stmt.close();
				if(conn!= null) conn.close();
			}catch(SQLException se2) {
				System.out.println(se2.getMessage());
			}
		}
	}
}