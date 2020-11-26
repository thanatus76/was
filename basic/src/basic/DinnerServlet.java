package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DinnerServlet")
public class DinnerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		String[] dinner = request.getParameterValues("dinner");
		
		out.println("<html>");
		out.println("<head>");
		out.println("\t<title>저녁식사</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h3>오늘의 저녁</h3>");
		out.println("\t<ul>");
		for (String str : dinner) {
			out.println("\t\t<li>" + str + "</li>");
		}
		out.println("\t</ul>");
		out.println("</body>");
		out.println("</html>");
		
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
