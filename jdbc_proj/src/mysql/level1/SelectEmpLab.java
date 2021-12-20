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
			System.out.println("�ش� Ŭ������ ã�� �� �����ϴ�.");
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
				rs = stmt.executeQuery("select ename, CONCAT(FORMAT(sal,0),'��') from emp");
				while(rs.next()) {
					System.out.println(rs.getString("ename")+" ������ ������ "  
							+ rs.getString(2)+"�Դϴ�.");
				}
			}else {
				rs = stmt.executeQuery("SELECT ename, DATE_FORMAT(hiredate, \"%Y�� %m�� %d��\") from emp order by hiredate asc");
				while(rs.next()) {
					System.out.println(rs.getString("ename") + " ������ "
							+ rs.getString(2) + "�� �Ի��Ͽ����ϴ�.");
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
