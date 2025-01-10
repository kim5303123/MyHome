package himedia.kdt.myhome.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/cookie/get")
public class GetCookieServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		Cookie[] cookies = req.getCookies();
		
		out.println("<h1>Cookie 읽기</h1>");
		
		out.println("<ul>");
		for (Cookie cookie: cookies) {
			out.printf("<li>%s : %s<li>",
					cookie.getName(),
					URLDecoder.decode(cookie.getValue(), 
							"UTF-8"));
		}
		out.println("</ul>");
	}
	
}