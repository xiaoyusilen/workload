package com.workload.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ClassDesCulServlet
 */
public class ClassDesCulServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClassDesCulServlet() {
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
		int student=Integer.parseInt(request.getParameter("student"));
		double week=Double.parseDouble(request.getParameter("week"));
		double t = 0;
		HttpSession session=request.getSession();
		if(student<=30)
			t=0.6*student;
		if(student>30&&student<=40)
			t=18+(student-30)*0.4;
		if(student>40&&student<=60)
			t=18+4+(student-40)*0.3;
		if(student>60)
			t=18+4+6+(student-60)*0.2;
		double ml=t*week;
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
