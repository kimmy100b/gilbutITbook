package sec04.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginTest2")
public class LoginTest2 extends HttpServlet {
	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init �޼��� ȣ��");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String id = request.getParameter("user_id");
		String pw = request.getParameter("user_pw");
		
		out.print("<html>");
		out.print("<body>");
		if( id != null && (id.length() != 0)) {
			if(id.equals("admin")) {
				out.print("<h1>�����ڷ� �α����ϼ̽��ϴ�!!</h1>");
				out.print("<br>");
				out.print("<input type=button value='ȸ������ ����' />");
				out.print("<input type=button value='ȸ������ ����' />");
			}else {
				out.print(id+"��! �α����ϼ̽��ϴ�.");
			}
		}else {
			out.print("���̵� �Է��ϼ���!!");
			out.print("<br>");
			out.print("<a href='/pro06/test01/login.html'>�α���â���� �̵�</a>");
		}
		
		out.print("</body>");
		out.print("</html>");
	}
	
	public void destroy() {
		System.out.println("destory �޼��� ȣ��");
	}

}
