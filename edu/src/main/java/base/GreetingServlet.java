package base;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/greeting")
public class GreetingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		LocalDate now = LocalDate.now(); 
		PrintWriter out = response.getWriter();
		if(request.getParameter("guestname") != null) {
			out.print("<h2>" + request.getParameter("guestname") + "님 반가워요.." 
		+ "오늘은 " + now.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.KOREAN) +"요일입니다.</h2>");
		}
		else {
			out.print("<h2>손님 반가워요.. "+ "오늘은 " 
		+ now.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.KOREAN) +"요일입니다.</h2>");
		}
		out.close();
	}
	

}
