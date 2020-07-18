package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletConfig config = getServletConfig();
		PrintWriter out = response.getWriter();
		out.print("<h1>Hello World ! Service method</h1>");
		out.print("<br><h1>Acessing config parameters</h1>");
		out.print("sql = "+config.getInitParameter("sql"));
		out.print("<br/>Message = "+config.getInitParameter("message"));
		out.print("<br><h1>Acessing content parameters in MyServlet</h1>");
		ServletContext  application = getServletContext();
		out.print("Driver (MyServlet)= "+application.getInitParameter("driver"));
		out.print("<br/>url (MyServlet) = "+application.getInitParameter("url"));
		
	}
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		String name = request.getParameter("fname");
		out.print("<h2>Hello World ! do Get method</h2>");
		out.print("<br/>Hello "+name);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter out = response.getWriter();
		String name = request.getParameter("fname");
		out.print("Hello World ! do Post method");
		out.print("<br/>Hello "+name);
	}

}
