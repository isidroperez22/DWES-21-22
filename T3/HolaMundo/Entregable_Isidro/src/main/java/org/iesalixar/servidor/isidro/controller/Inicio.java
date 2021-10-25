package org.iesalixar.servidor.isidro.controller;

import java.io.IOException;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.*;

/**
 * Servlet implementation class Inicio
 */
@WebServlet("/Inicio")
public class Inicio extends HttpServlet {
	private static final long serialVersionUID = 1L;
	final static Logger logger = Logger.getLogger(Inicio.class);
	private static final String PASSWORD_REGEX =
	        "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,16}$";
	private static final Pattern PASSWORD_PATTERN =
            Pattern.compile(PASSWORD_REGEX);
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Inicio() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("inicio.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String confirmarpass = request.getParameter("confirmar");
		
		if(request.getParameter("registrarse") != null && request.getParameter("registrarse").equals("entrar")
			&& request.getParameter("password").equals(confirmarpass)) {
			
			logger.info("El usuario ha entrado en la sesion");
			
			HttpSession sesion = request.getSession();
			sesion.setAttribute("logeado", true);
			sesion.setAttribute("usuario", request.getAttribute("usuario"));
			sesion.setAttribute("InicioSesion", sesion.getCreationTime());
			
			//sesion.setMaxInactiveInterval(300);
			
			response.sendRedirect(request.getContextPath()+"/Reservar");
			
			return;
			
		}
		
		
		
		response.sendRedirect(request.getContextPath());
	}

}
