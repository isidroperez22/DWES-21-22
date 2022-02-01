package controller;

import java.io.IOException;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import dao.UserDAOImpl;

public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4249780684684026453L;
	
	//private UserDAOImpl userDAO = new UserDAOImpl();
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		//String appNameUrl = (new Properties().load(Thread.currentThread().getContextClassLoader().getResourceAsStream("config.properties"))).getProperty("app.name.url");

		String 	urlLogin = "/" + getServletContext().getInitParameter("app.name.url") + "/login.jsp", 
				urlIndex = "/" + getServletContext().getInitParameter("app.name.url") + "/index.jsp";
		try {
			if (true/*userDAO.login(username, password)*/) {
				HttpSession session = request.getSession();
				session.setAttribute("username", username);
				
				Cookie loginCookie = new Cookie("username",username);	            
	            loginCookie.setMaxAge(30*60); //setting cookie to expiry in 30 mins
	            
	            response.addCookie(loginCookie);
	            response.sendRedirect(urlIndex);
			} else {
				RequestDispatcher rd = getServletContext()
						.getRequestDispatcher("/login.jsp");//urlLogin);
				rd.forward(request, response);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect(urlLogin);
		}
	}

}
