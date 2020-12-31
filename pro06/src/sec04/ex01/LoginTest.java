package sec04.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginTest")
public class LoginTest extends HttpServlet {

	public void init(ServletConfig config) throws ServletException {
		System.out.println("init �޼��� ȣ��");
	} 

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String id = request.getParameter("user_id");
		String pw = request.getParameter("user_pw");
		
		String data = "<html>";
		data += "<body>";
		if(id.length() == 0 || id == null) {
			data += "���̵� �Է��ϼ���!<br>";
			data += "<a href='/pro06/test01/login.html'>�α���â���� �̵�</a>";
		}else {
			data += id+"��! �α����ϼ̽��ϴ�."; 
		}
		data += "</body>";
		data += "</html>";
		
		out.print(data);
	}
	
	public void destroy() {
		System.out.println("destory �޼��� ȣ��");
	}

}
