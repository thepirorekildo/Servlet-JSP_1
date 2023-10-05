package com.login;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;


public class Login extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		
		
		//verify
		if(uname.equals("rekildo") && pass.equals("3012")) {
			
				HttpSession session = request.getSession();
				session.setAttribute("username", uname);

			  response.sendRedirect("welcome.jsp");
		}else {
		       
			response.sendRedirect("login.jsp");
		}
	}

}
