package himedia.kdt.controllers;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;

public class BaseServlet extends HttpServlet {
	/**
	 * @Author : 202-12
	 * @Date : 2025. 1. 8.
	 */
	protected String dbUser = null;
	protected String dbPass = null;
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		
		ServletContext context = getServletContext();
		dbUser = context.getInitParameter("dbUser");
		dbPass = context.getInitParameter("dbPass");
	}
	
	
}
