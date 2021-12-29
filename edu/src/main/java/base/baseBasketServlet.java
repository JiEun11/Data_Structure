package base;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/basket")
public class baseBasketServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String pid = request.getParameter("pid");
		out.print("<h1>선택한 상품 : " + pid + "</h1>");
		
		pid = pid.substring(1);
		
		out.print("<img src=/edu/images/" + pid + ".jpg>");
		out.print("<hr>");
		out.print("<a href='/edu/htmlexam/productlog.html'>상품 선택 화면</a>");
		out.close();
		
	}

}
