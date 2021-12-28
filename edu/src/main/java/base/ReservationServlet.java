package base;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/reservation")
public class ReservationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("UTF-8");
		
		String rname = request.getParameter("rname");
		String rplace = request.getParameter("rplace");
		String[] rextra = request.getParameterValues("rextra");
		
		String rdate = request.getParameter("rdate");
		SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy년 MM월 dd일");
		Date rndate = null;
		try {
			rndate = formatter1.parse(rdate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String date = formatter2.format(rndate);

		out.print("<h1>"+rname + "님의 예약 내용</h1>");
		out.print("<hr>");
		out.print("<li>휴양림: " + rplace +"</li");
		out.print("<br>");
		out.print("<li> 추가 요청 사항 : ");
		if (rextra == null) {
			out.print("추가 요청사항이 없습니다.");	
		}
		else {
			for (int i=0 ; i<rextra.length ; ++i) {
				if (i == rextra.length -1) {
					out.print(rextra[i]);
					break;
				}
				out.print(rextra[i] +",");
			}
		}
		
		out.print("<li>예약날짜: " + date);
	}

}
