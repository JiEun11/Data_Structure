package base;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/lotto2")
public class LottoServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int ranNum = (int) ((Math.random() * 6) + 1); // 랜덤숫자

		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();

		HttpSession session = request.getSession();
		
		if (session.getAttribute("cnt") == null) {
			session.setAttribute("cnt", new int[1]);
		}
		int[] session_v = (int[]) session.getAttribute("cnt");

		String lnum = request.getParameter("lnum");
		System.out.printf("전달된 값 : %s, 추출된 값 : %d %n", lnum, ranNum);
		RequestDispatcher rd;
		if (ranNum == Integer.parseInt(lnum)) {
			if (session_v[0] <= 3) {
//				rd = request.getRequestDispatcher("/htmlexam/success.html");
				rd = request.getRequestDispatcher("/jspsrc/success.jsp");
			} else {
//				rd = request.getRequestDispatcher("/htmlexam/impossible.html");
				rd = request.getRequestDispatcher("/jspsrc/impossible.jsp");
			}

		} else {
			if (session_v[0] <= 3) {
//				rd = request.getRequestDispatcher("/htmlexam/fail.html");
				rd = request.getRequestDispatcher("/jspsrc/fail.jsp");
				System.out.println(session_v[0]);
				session_v[0] += 1;
			} else {
//				rd = request.getRequestDispatcher("/htmlexam/impossible.html");
				rd = request.getRequestDispatcher("/jspsrc/impossible.jsp");
			}
		}
		rd.forward(request, response);
		out.close();
	}

}
