package BrandProject;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
/**
 * Servlet implementation class Servlet3
 */
@WebServlet("/Servlet3")
public class Servlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int no1,no2,result;
		no1 = Integer.parseInt(request.getParameter("no1"));
		no2 = Integer.parseInt(request.getParameter("no2"));
		System.out.println(no1+" "+no2);
		result = no1+no2;
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<h1 style='width:50%;margin:10px auto;text-align:center;;background:darkcyan;padding:10px;color:white;border-radius:5px;'>Addition is "+result+"</h1>");
		out.println("<a href='index.html'>Back</a>");
	}

}
