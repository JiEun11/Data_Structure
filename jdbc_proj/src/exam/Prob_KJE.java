package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Prob_KJE {

	public static void main(String[] args) {
		
		printEmp("A");
		printEmp("Q");
		printEmp("T");
	}

	
	public static void printEmp(String pn) {
		
		/*
		 *  Mysql Driver loading 실패시 예외 처리 
		 */
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
			return;
		}
		
		/*
		 *  sqldb 접속할 url user, passwd
		 */
		String url = "jdbc:mysql://localhost:3306/sqldb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "root";
		String passwd = "1234";
		String letter = pn;
		
		try (Connection conn = DriverManager.getConnection(url, user, passwd);
			PreparedStatement pstmt = conn.prepareStatement("select ename, city from emp join dept using (deptno) join locations using (loc_code) where ename like ? ");
		){
			pstmt.setString(1,"%"+letter+"%");
		
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				System.out.printf("** 이름에 %s 문자가 들어간 직원들의 리스트 **\n", letter);
				do {
					System.out.println(rs.getString("ename")+"(" + rs.getString("city") +")");
				}while(rs.next());
			}else {
				System.out.printf("~~ 이름에 %s 문자가 들어간 직원들은 없음 ~~\n", letter);
			}
		}catch(SQLException se1) {
			System.out.print("[오류발생] ");
			System.out.println(se1.getMessage());
		}
		
	}
}
