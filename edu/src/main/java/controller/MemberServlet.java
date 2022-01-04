package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.MemberVO;


@WebServlet("/member")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String usname = checkString(request.getParameter("usname"));
		String usphoneNum = checkString(request.getParameter("usphoneNum"));
		String usid = checkString(request.getParameter("usid"));
		String uspw = checkString(request.getParameter("uspw"));
		request.setCharacterEncoding("utf-8");
		MemberVO mv = new MemberVO();
		
		mv.setUsname(usname);
		mv.setUsphoneNum(usphoneNum);
		mv.setUsid(usid);
		mv.setUspw(uspw);
		
		request.setAttribute("objmem", mv);
		
		request.getRequestDispatcher("/jspsrc/memberView.jsp").forward(request, response);
	}
	
	public String checkString(String value) {
		if(value == null || value.equals("")) {
			return "없음";
		}else return value;
	}

}
