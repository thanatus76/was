package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Network")
public class NetInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("\t<title>Request 정보</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("\t<h3>네트워크 정보</h3>");
		out.println("\t<ul>");
		out.printf("\t\t<li>Request Scheme : %s</li>", request.getScheme());
		out.printf("\t\t<li>Server Name : %s</li>", request.getServerName());
		out.printf("\t\t<li>Server Address : %s</li>", request.getLocalAddr());
		out.printf("\t\t<li>Server Port : %s</li>", request.getServerPort());
		out.printf("\t\t<li>Client Address : %s</li>", request.getRemoteAddr());
		out.printf("\t\t<li>Client Host : %s</li>", request.getRemoteHost());
		out.printf("\t\t<li>Client Port : %s</li>", request.getRemotePort());
		out.printf("\t\t<li>Client user-Agent : %s</li>", request.getHeader("user-agent"));
		out.println("\t</ul>");
		out.println("</body>");
		out.println("</html>");
		
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
