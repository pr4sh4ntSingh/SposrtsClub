package com.Servelets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dbutil.CrudOperation;

/**
 * Servlet implementation class Messaging
 */
@WebServlet("/Messaging")
public class Messaging extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;
	HttpSession hs;
	PreparedStatement ps;
	ResultSet rs;
	PrintWriter pw;
     Date dt;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Messaging() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		pw=response.getWriter();
		hs=request.getSession(false);
		String message=request.getParameter("message");
		String reciever=request.getParameter("reciever");
		//long time=dt.getTime();
		//Date dt=new Date();
        con=CrudOperation.createConnection();	
		String strq="Insert into message(senderid,recieverid,message) values ('"+hs.getAttribute("userinfo")+"','"+reciever+"','"+message+"')";
		try{
			ps=con.prepareStatement(strq);
			int z=ps.executeUpdate();
			if(z>0)
			{
				response.sendRedirect("/Sportsclub/jsp/outbox.jsp");
			}
			
		}
		catch(SQLException se)
		{
			System.out.println(se);
		}
		
	//	pw.print(strq);
		//pw.print(dt);
		
	}

}
