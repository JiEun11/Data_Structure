package base;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lotto1")
public class LottoServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int ranNum = (int)((Math.random()*6)+1); //랜덤숫자
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String lnum = request.getParameter("lnum");
		
		System.out.printf("전달된 값 : %s, 추출된 값 : %d %n", lnum, ranNum);
		
		RequestDispatcher rd;
		
		if(ranNum == Integer.parseInt(lnum)) {
			rd = request.getRequestDispatcher("/htmlexam/success.html");
			
		}else {
			rd = request.getRequestDispatcher("/htmlexam/fail.html");
		}
		rd.forward(request, response);
		out.close();
	}

}
