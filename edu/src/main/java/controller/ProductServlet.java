package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import vo.ProductVO;

@WebServlet("/productServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String productId = request.getParameter("pid");

		HttpSession session = request.getSession();
		if (session.getAttribute("prdsession") == null) {
			session.setAttribute("prdsession", new ProductVO());
		}

		ProductVO po = (ProductVO) session.getAttribute("prdsession");

		if (productId.equals("p001")) {

			po.setAppleCnt(1);

		} else if (productId.equals("p002")) {

			po.setBananaCnt(1);

		} else if (productId.equals("p003")) {

			po.setHalabongCnt(1);

		}

		request.getRequestDispatcher("/jspsrc/productView.jsp").forward(request, response);

	}

}
