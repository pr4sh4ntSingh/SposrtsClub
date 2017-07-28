package com.Servelets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dbutil.CrudOperation;
import com.mysql.jdbc.PreparedStatement;

/**
 * Servlet implementation class Login
 */
@WebServlet("/LoginServ")
public class LoginServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	Connection con=null;
	HttpSession hs=null;
	PreparedStatement st=null;
	ResultSet rs;
	java.sql.PreparedStatement ps;
     public LoginServ() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		hs=request.getSession(false);
		hs.removeAttribute("userinfo");
		hs.invalidate();
		response.sendRedirect("/Sportsclub/jsp/user4.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String ui=request.getParameter("id");
		//response.setContentType("text/html");
		//PrintWriter pw1=response.getWriter();
	//	pw1.println("ghgh"+ui);
		
		String upass=request.getParameter("password");
		String utype;
		//PrintWriter pw2=response.getWriter();
	//	pw2.println("ghgh"+upass);
		 if(ui.equals("admin") && upass.equals("root"))
			
		    {
		    	hs=request.getSession();
		    	hs.setAttribute("userinfo", "Admin");
		    	hs.setAttribute("username", "Admin");
		    	response.sendRedirect("/Sportsclub/jsp/admin.jsp");
		    }
		 else{
		
		con=CrudOperation.createConnection();
		
		
		String strsql="Select * from login where userid=? and password=? and isverified=1";
		try{
			ps=con.prepareStatement(strsql);
		   ps.setString(1,ui);
		ps.setString(2,upass);
					
		    
		   
		    	rs=ps.executeQuery();
		if(rs.next()){
			
			
			hs=request.getSession();
			hs.setAttribute("userinfo", ui);
			
			//String utype=(String) hs.getAttribute("userinfo");
			
		  utype=rs.getString("role");
		  String uname=rs.getString("name");
		  hs.setAttribute("username", uname);
			hs.setAttribute("userrole", utype);
			if(utype.equals("player"))
			{
				response.sendRedirect("/Sportsclub/jsp/user4.jsp");
			}
			else if(utype.equals("user"))
			{
				response.sendRedirect("/Sportsclub/jsp/user4.jsp");
				
			}
			else if(utype.equals("expert"))
			{
				response.sendRedirect("/Sportsclub/jsp/user4.jsp");
				
			}
			else if(utype.equals("coach"))
			{
				response.sendRedirect("/Sportslub/jsp/user4.jsp");
				
			}
		}
		else{
			response.sendRedirect("registration.html");
		//	PrintWriter pw=response.getWriter();
			//pw.println(ps);
	     	}
		
		}
		catch(SQLException se){
		   System.out.println(se);}
		
	
finally{
	try
	{
		if(rs!=null){
				       rs.close();
				    }
		if(ps!=null)
		{
			ps.close();
		}
	}
catch(SQLException se)
	{
	System.out.print(se);
	}
}
}
	}
}