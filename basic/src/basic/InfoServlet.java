package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/InfoServlet")
public class InfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("uname");
		String id = request.getParameter("uid");
		String pwd = request.getParameter("upwd");
		String gender = request.getParameter("ugender");
		String job = request.getParameter("ujob");
		
		out.println("<html>");
		out.println("<head>");
		out.println("\t<title>개인 정보 입력 - 결과 화면</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h3>개인 정보 입력</h3>");
		out.println("\t<ul>");
		out.println("\t\t<li>이름 : " + name + "</li>");
		out.println("\t\t<li>아이디 : " + id + "</li>");
		out.println("\t\t<li>암호 : " + pwd + "</li>");
		out.println("\t\t<li>성별 : " + gender + "</li>");
		out.println("\t\t<li>직업 : " + job + "</li>");
		out.println("\t</ul>");
		out.println("</body>");
		out.println("</html>");
		
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
