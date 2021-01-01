package sec02.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/set")
public class SetCookieValue extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		Date d = new Date();
		Cookie c = new Cookie("cookieTest", URLEncoder.encode("JSP ���α׷����Դϴ�.","utf-8"));
		c.setMaxAge(24*60*60); //�ʴ��� 1�� = 24*60*60, 365�� = 365*60*60
//		c.setMaxAge(-1); //Session ��Ű�� ����(������ ���� �� ��Ű ����)
		response.addCookie(c);
		out.println("����ð� : "+d);
		out.println("<br>���ڿ��� Cookie�� �����մϴ�.");
	}

}
