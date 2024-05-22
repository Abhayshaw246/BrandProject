package BrandProject;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

/**
 * Servlet implementation class Servlet4
 */
@WebServlet("/Servlet4")
public class Servlet4 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String mySqlUser="root";
			String mySqlPwd="abhayraja@123";
			String ServerName="jdbc:mysql://localhost:3306/projectdb";
			
			
			Connection con = DriverManager.getConnection(ServerName,mySqlUser,mySqlPwd);
			String fullname,emailAdd,mobno;
			int regno;
			regno=Integer.parseInt(request.getParameter("regno"));
			fullname=request.getParameter("fullname");
			emailAdd=request.getParameter("emailAdd");
			mobno=request.getParameter("mobno");
			String sqlQuery="INSERT INTO students(RegistrationNumber,Fullname,Email,MobileNo) VALUES(?,?,?,?);";
			
			PreparedStatement stm = con.prepareStatement(sqlQuery);
			stm.setInt(1, regno);
			stm.setString(2, fullname);
			stm.setString(3, emailAdd);
			stm.setString(4, mobno);
			stm.executeUpdate();
			stm.close();
			con.close();
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<h1>Student Registered Successfully!!</h1>");
			out.println("<a href='project4.html'>Back</a>");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
 
}
