package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.User;
import com.service.UserService;
import com.service.UserServiceImpl;

/**
 * Servlet implementation class signup
 */
@WebServlet("/signupServlet")
public class signupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public signupServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("signup.jsp").forward(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fn =  request.getParameter("fname");
		String ln = request.getParameter("lname");
		String un = request.getParameter("username");
		String pwd = request.getParameter("password");
		
		
		//send user data in db
		
		User u = new User();
		u.setFname (fn);
		u.setLname(ln);
		u.setUsername(un);
		u.setPassword(pwd);
		UserService us = new UserServiceImpl ();
		us.userSignup(u);
		
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}

}
