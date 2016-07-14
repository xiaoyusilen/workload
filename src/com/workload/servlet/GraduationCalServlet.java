package com.workload.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class GraduationCalServlet
 */
public class GraduationCalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GraduationCalServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

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
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String ctype=request.getParameter("ctype");
		int student=Integer.parseInt(request.getParameter("student"));
		double week=Double.parseDouble(request.getParameter("week"));
		double t = 0;
		HttpSession session=request.getSession();
		if(ctype.equals("经管类"))
		{
			t=0.8;
		}
		if(ctype.equals("理工科"))
		{
			t=1.0;
		}
		double ml=t*student*week;
		double m=(double)session.getAttribute("m");
		if(m==0)
			m=ml;
		else
			m=m+ml;
		System.out.println("m="+m);
		session.setAttribute("m", m);
		response.sendRedirect("homepage.jsp");
	}

}
