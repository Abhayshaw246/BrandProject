package BrandProject;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
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