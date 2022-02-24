package org.iesalixar.servidor.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.iesalixar.servidor.dao.DAOCustomerImpl;
import org.iesalixar.servidor.dao.DAOOrderImpl;
import org.iesalixar.servidor.models.Order;

/**
 * Servlet implementation class ChangeOrderServlet
 */
@WebServlet("/ChangeOrderServlet")
public class ChangeOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangeOrderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer order = Integer.parseInt(request.getParameter("ord"));
		
		DAOOrderImpl dao = new DAOOrderImpl();
		
		DAOCustomerImpl daoCust = new DAOCustomerImpl();
		
		request.setAttribute("order", dao.getOrder(order));
		
		request.setAttribute("customer", daoCust.getAllCustomers());
		
		request.getRequestDispatcher("../WEB-INF/view/admin/changeOrder.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int customerNumber = Integer.parseInt(request.getParameter("customerNumber"));
		
		Order order = new Order();
		
		DAOOrderImpl dao = new DAOOrderImpl();
		
		order.setOrderNumber(customerNumber);
		
		dao.updateOrder(order);
		
		response.sendRedirect(request.getContextPath() + "/Home");
	}

}
