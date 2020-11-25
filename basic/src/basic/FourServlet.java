package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FourServlet")
public class FourServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("\t<title>사칙연산 프로그램</title>");
		out.println("</head>");
		out.println("<body>");
		
		try {
			int num1 = Integer.parseInt(request.getParameter("num1"));
			int num2 = Integer.parseInt(request.getParameter("num2"));
			String op = request.getParameter("op");
			
			switch (op) {
			case "+" : {
				int sum = num1 + num2;
				out.println("\t<h2>덧셈결과</h2>");
				out.println("\t<h3>" + num1 + " + " + num2 + " = " + sum + "</h3>");
				break;
			}
			case "-" : {
				int sum = num1 - num2;
				out.println("\t<h2>뺄셈결과</h2>");
				out.println("\t<h3>" + num1 + " - " + num2 + " = " + sum + "</h3>");
				break;
			}
			case "*" : {
				int sum = num1 * num2;
				out.println("\t<h2>곱셉결과</h2>");
				out.println("\t<h3>" + num1 + " * " + num2 + " = " + sum + "</h3>");
				break;
			}
			case "/" : {
				double sum = (double) num1 / (double) num2;
				out.println("\t<h2>나눗셈결과</h2>");
				if (Double.isInfinite(sum)) {
					throw new ArithmeticException();
				}
				out.println("\t<h3>" + num1 + " / " + num2 + " = " + sum + "</h3>");
				break;
			}
			default : {
				
			}
			}
		} catch(NumberFormatException e) {
			out.println("\t<h3>" + "입력값이 잘못되었습니다" + "</h3>");
		} catch (ArithmeticException e) {
			out.println("\t<h3>" + "0으로 나눌 수 없습니다" + "</h3>");
		} finally {
			out.println("</body>");
			out.println("</html>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
