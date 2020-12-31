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
		System.out.println("init 메서드 호출");
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
			data += "아이디를 입력하세요!<br>";
			data += "<a href='/pro06/test01/login.html'>로그인창으로 이동</a>";
		}else {
			data += id+"님! 로그인하셨습니다."; 
		}
		data += "</body>";
		data += "</html>";
		
		out.print(data);
	}
	
	public void destroy() {
		System.out.println("destory 메서드 호출");
	}

}
