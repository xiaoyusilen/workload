package com.workload.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.workload.dao.CtypeDao;
import com.workload.dao.impl.CtypeDaoimpl;
import com.workload.entity.Classes;

/**
 * Servlet implementation class ClassCalServlet
 */
public class ClassCalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClassCalServlet() {
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
		String ctype = request.getParameter("ctype");
		int sum=Integer.parseInt(request.getParameter("sum"));
		int student=Integer.parseInt(request.getParameter("student"));
		String crep=request.getParameter("crep");
		String newclass=request.getParameter("newclass");
		CtypeDao ctypedao=new CtypeDaoimpl();
		double k=ctypedao.cal(ctype, student);
		HttpSession session=request.getSession();
		if(newclass.equals("新"))
		{
			k=k*1.2;
		}
		double q=(double)sum/16.0*17.0;
		double ml=q*k;
		if(crep.equals("重复"))
		{
			int restu=Integer.parseInt(request.getParameter("restu"));
			double kl=ctypedao.cal(ctype, restu);
			double ml2;
			if(newclass.equals("新"))
			{
				kl=kl*1.2;
				ml2=kl*q*0.9+ml;
			}
			else
			{
				ml2=kl*q*0.9+ml;
			}
			ml=ml2;
		}
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
