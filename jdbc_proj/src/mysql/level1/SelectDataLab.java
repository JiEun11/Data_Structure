package mysql.level1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDataLab {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다. " + cnfe.getMessage());
			return;
		}
		String url = "jdbc:mysql://localhost:3306/jdbcdb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "root";
		String passwd = "1234";
		try(Connection conn = DriverManager.getConnection(url, user, passwd);
				Statement stmt = conn.createStatement()){
			ResultSet rs = stmt.executeQuery("select id, name, title, date_format(meetingdate,\"%Y년 %c월 %e일 %H시 %i분\" ) from meeting");
			while(rs.next()) {
				System.out.println("[id가 " +rs.getInt(1) + "인 친구]" );
				System.out.println("친구이름: " + rs.getString(2));
				System.out.println("미팅목적: " + rs.getString(3));
				System.out.println("미팅시간: " + rs.getString(4));
			}
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
	}

}
