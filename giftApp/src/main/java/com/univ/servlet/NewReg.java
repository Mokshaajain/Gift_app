package com.univ.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.univ.DTO.NewregDTO;
import com.univ.DAO.NewregDAO;

/**
 * Servlet implementation class NewReg
 */
@WebServlet("/NewReg")
public class NewReg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewReg() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		NewregDTO d1= new NewregDTO();
		d1.setCname(request.getParameter("cname"));
		d1.setCadd(request.getParameter("cadd"));
		d1.setMob(Integer.parseInt(request.getParameter("mob")));
		d1.setEmail(request.getParameter("email"));
		d1.setUnm(request.getParameter("unm"));
		d1.setPw(request.getParameter("pw"));
		NewregDAO dao= new NewregDAO();
		int x=dao.insert(d1);
		if(x==1)
			response.sendRedirect("reg.jsp");
		else
			response.sendRedirect("error.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
