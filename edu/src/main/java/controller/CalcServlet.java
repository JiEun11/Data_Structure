package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/calculator")
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num1 = Integer.parseInt(request.getParameter("num1"));
		String opr = request.getParameter("operator");
		int num2 = Integer.parseInt(request.getParameter("num2"));
		int result = 0;
		String errmsg = "나눗셈 연산시 두 번째 숫자는 0일 수 없습니다!!";
		
		try {
			
			switch(opr) {
			case "add":
				result = num1 + num2;
				break;
			case "subtract":
				result = num1 - num2;
				break;
			case "multiple":
				result = num1 * num2;
				break;
			case "division":
				result= num1 / num2;
				break;
			}

			request.setAttribute("objcal", result);
			request.getRequestDispatcher("/jspsrc/calcResultEL.jsp").forward(request, response);	
			
		}catch(Exception e) {
			request.setAttribute("objcal", errmsg);
			request.getRequestDispatcher("/jspsrc/errorResultEL.jsp").forward(request, response);
			
		}
		
	}

}
