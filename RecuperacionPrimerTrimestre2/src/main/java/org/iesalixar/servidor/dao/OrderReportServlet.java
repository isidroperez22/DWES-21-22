package org.iesalixar.servidor.dao;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OrderReportServlet
 */
@WebServlet("/OrderReportServlet")
public class OrderReportServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderReportServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer order = Integer.parseInt(request.getParameter("ord"));
		DAOOrderImpl dao = new DAOOrderImpl();
		
		request.setAttribute("order", dao.getOrder(order));
		
//		DAOOrderDetailsImpl daoOD = new DAOOrderDetailsImpl();
//		
//		request.setAttribute("od", daoOD.getDetailsFromOrder(order));
//		
		request.getRequestDispatcher("WEB-INF/view/orderReport").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
