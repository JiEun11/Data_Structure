package mysql.level1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

public class SelectEmpLab {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다.");
			return;
		}
		
		String url = "jdbc:mysql://localhost:3306/sqldb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "root";
		String passwd = "1234";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = DriverManager.getConnection(url,user,passwd);
			stmt = conn.createStatement();
			Random random = new Random();
			boolean check = random.nextBoolean();
			System.out.println(check);
			System.out.println("-------------------------------");
			
			if(check) {
				rs = stmt.executeQuery("select ename, CONCAT(FORMAT(sal,0),'원') from emp");
				while(rs.next()) {
					System.out.println(rs.getString("ename")+" 직원의 월급은 "  
							+ rs.getString(2)+"입니다.");
				}
			}else {
				rs = stmt.executeQuery("SELECT ename, DATE_FORMAT(hiredate, \"%Y년 %m월 %d일\") from emp order by hiredate asc");
				while(rs.next()) {
					System.out.println(rs.getString("ename") + " 직원은 "
							+ rs.getString(2) + "에 입사하였습니다.");
				}
			}
		} catch (SQLException se1) {
			System.out.println(se1.getMessage());
		}finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			} catch (SQLException se2) {
				System.out.println(se2.getMessage());
			}
		}
	}

}
