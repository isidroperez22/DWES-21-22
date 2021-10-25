package org.iesalixar.servidor.isidro.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.*;
/**
 * Servlet implementation class Reservar
 */
@WebServlet("/Reservar")
public class Reservar extends HttpServlet {
	private static final long serialVersionUID = 1L;
	final static Logger logger = Logger.getLogger(Reservar.class);
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Reservar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession sesion = request.getSession();
		if (!sesion.isNew() && sesion.getAttribute("logeado") != null && ((boolean) sesion.getAttribute("logeado")))  {
			request.getRequestDispatcher("reservar.jsp").forward(request, response);
			return;
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession sesion = request.getSession();
		  if (!sesion.isNew() && sesion.getAttribute("logeado")!=null && ((boolean)sesion.getAttribute("logeado"))) {

	            if ( request.getParameter("reservar")!=null && request.getParameter("reservar").equals("reservar")) {

	                if (request.getParameter("inicio")!=null && request.getParameter("fin")!=null
	                        && request.getParameter("numPersonas")!=null) {

	                    sesion.setAttribute("fechaInicio", (request.getParameter("inicio")));
	                    sesion.setAttribute("fechaFin", (request.getParameter("fin")));
	                    sesion.setAttribute("numPersonas", (request.getParameter("numero")));
	                    sesion.setAttribute("checkbox", request.getParameterValues("checkbox"));

	                }

	                response.sendRedirect(request.getContextPath()+"/Confirmar");
	                return;

	            } else {

	                logger.error("Faltan parámetros o hay un dato incorrecto");

	                response.sendRedirect(request.getContextPath()+"/Reservar");
	                return;

	            }

	        }
	}

}
