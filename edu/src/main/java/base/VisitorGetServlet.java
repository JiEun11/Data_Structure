package base;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/visitorget")
public class VisitorGetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("stname");
		String op = request.getParameter("op");
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		LocalDate date = LocalDate.now();
		String now = date.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일"));

		out.print("<h2>" + name + " 님이 " + now + "에 남긴 글입니다.</h2>");
		out.print("<hr>");
		out.print("내용: " + op);
		out.print("<p>");
		out.print("<a href='/edu/htmlexam/visitorForm.html'>" + "입력화면으로... </a>");
		out.close();
	}

}
