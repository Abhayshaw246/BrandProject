package BrandProject;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		int no,result = 1,i;
		no = Integer.parseInt(request.getParameter("no1"));
		for(i=1;i<=no;i++) {
			result = result*i;
		}
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1 style='width:50%;margin:10px auto;text-align:center;background:darkcyan;padding:10px;color:white;border-radius:5px;'>Factorial of "+no+" is "+result+"</h1>");
		out.println("<a href='project2.html'>Back</a>");
	}
}