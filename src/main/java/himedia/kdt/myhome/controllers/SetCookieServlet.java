package himedia.kdt.myhome.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/cookie/set")
public class SetCookieServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// testCookie => 메시지를 쿠키로 저장
		PrintWriter out = resp.getWriter();
		
		out.println("<h1>Cookie 저장</h1>");
		Cookie c = new Cookie("testCookie",
				URLEncoder.encode("Servlet에서 쿠키를 저장합니다.", "UTF-8"));
		c.setMaxAge(24 * 60 * 60);	//	초단위 설정
		resp.addCookie(c);
		
		out.printf("<p>%s를 쿠키이름 %s로 저장했습니다.</p>",
				c.getValue(), c.getName());
	}

	
}