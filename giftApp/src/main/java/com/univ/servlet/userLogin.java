package com.univ.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.univ.DAO.NewregDAO;
import com.univ.DTO.NewregDTO;

/**
 * Servlet implementation class userLogin
 */
@WebServlet("/userLogin")
public class userLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public userLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String unm=request.getParameter("unm");
		NewregDTO lg= new NewregDTO();
		lg.setUnm(unm);
		lg.setPw(request.getParameter("pw"));
		NewregDAO log= new NewregDAO();
		int x=log.check(lg);
		if(x==4) {
		HttpSession hs=request.getSession(true);
		hs.setAttribute("user", unm);
		response.sendRedirect("admin/index.jsp");
		}
		else
			if(x==1) {
				HttpSession hs=request.getSession(true);
				hs.setAttribute("user", unm);
				response.sendRedirect("index.jsp");
			}
		else {
			response.sendRedirect("Login.jsp");
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
