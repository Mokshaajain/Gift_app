package com.univ.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.univ.DAO.NewregDAO;
import com.univ.DTO.NewregDTO;

/**
 * Servlet implementation class SearchData
 */
@WebServlet("/SearchData")
public class SearchData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int cid= Integer.parseInt(request.getParameter("cid"));
		NewregDTO lg= new NewregDTO();
		lg.setCid(cid);
		NewregDAO log=new NewregDAO();
		NewregDTO data =log.search(lg);
		if(data!=null) {
			ServletContext ctx=getServletContext();
			RequestDispatcher rd=ctx.getRequestDispatcher("/search.jsp");
			request.setAttribute("name",data.getCname());
			request.setAttribute("add",data.getCadd());
			request.setAttribute("mob",data.getMob());
			request.setAttribute("email",data.getEmail());
			request.setAttribute("unm",data.getUnm());
			rd.forward(request,response);
		}
		else {
			response.sendRedirect("reg.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
