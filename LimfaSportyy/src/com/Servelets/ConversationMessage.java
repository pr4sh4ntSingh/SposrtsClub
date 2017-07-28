package com.Servelets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dbutil.CrudOperation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 * Servlet implementation class ConversationMessage
 */
@WebServlet("/ConversationMessage")
public class ConversationMessage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       HttpSession hs;
       Connection  con;
       PreparedStatement ps;
       ResultSet rs;
    public ConversationMessage() {
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
		
		hs=request.getSession(false);
		String message=request.getParameter("newmessage");
		String reciever=(String) hs.getAttribute("reciever");
		hs.setAttribute("redirectFromConversationMessage", reciever);
	    
		 con=CrudOperation.createConnection();	
			String strq="Insert into message(senderid,recieverid,message) values ('"+hs.getAttribute("userinfo")+"','"+reciever+"','"+message+"')";
			try{
				ps=con.prepareStatement(strq);
				int z=ps.executeUpdate();
				if(z>0)
				{
					
					response.sendRedirect("/Sportsclub/jsp/outox.jsp");
				}
				
			}
			catch(SQLException se)
			{
				System.out.print(se);
			}
			
			//pw.print(strq);
			//pw.print(dt);
	}

}
