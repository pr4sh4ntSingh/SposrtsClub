package com.Servelets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bean.RegistrationBean;
import com.dbutil.CrudOperation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
/**
 * Servlet implementation class UpdateServ
 */
@WebServlet("/UpdateServ")
public class UpdateServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection con=null;

	private PreparedStatement ps,ps1;
    private RegistrationBean rb=new RegistrationBean();
       
   
    public UpdateServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		con=CrudOperation.createConnection();
		
		String q="update login set isverified=1 where userid='"+request.getParameter("update")+"'";
		String q1="update registration set isverified=1 where userid='"+request.getParameter("update")+"'";

		try{
			con.setAutoCommit(false);
			ps=con.prepareStatement(q);
			ps1=con.prepareStatement(q1);
			
			int i=ps.executeUpdate();
			int j=ps1.executeUpdate();
			if(i>0&&j>0)
			{
				con.commit();
				response.sendRedirect("/Sportsclub/jsp/requests.jsp");}
		}
		catch(SQLException se)
		{
			System.out.println(se);
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		con=CrudOperation.createConnection();
		rb.setName(request.getParameter("name"));
	    rb.setAddr(request.getParameter("address"));
	    rb.setPhone(Long.parseLong(request.getParameter("phone")));
	    rb.setGame(request.getParameter("game"));
	    rb.setGender(request.getParameter("gender"));
	    rb.setId(request.getParameter("id"));
	    rb.setIdtype(request.getParameter("idtype"));
	    rb.setIdno(request.getParameter("idno"));
	    rb.setPhone(Long.parseLong(request.getParameter("phone")));
	    rb.setPassword(request.getParameter("password"));
	    rb.setRole(request.getParameter("role"));
		  String regisq="update registration set  name=?,game=?,phone=?, idtype=?, idno=?, role=? ,sex=?,address=?,password=?  where userid=? ";
		  try
		    {
		    	con.setAutoCommit(false);
		     	ps=con.prepareStatement(regisq);
		       //ps1=con.prepareStatement(loginq);
				
		       ps.setString(10,rb.getId());
		       ps.setString(1,rb.getName());
		       ps.setString(2,rb.getGame());
		       ps.setLong(3,rb.getPhone());
		       ps.setString(4,rb.getIdtype());
		       ps.setString(5,rb.getIdno());
		       ps.setString(6,rb.getRole());
		       ///ps.setString(7,"33d");
		       ps.setString(7,rb.getGender());
		       ps.setString(8,rb.getAddr());
		       ps.setString(9,rb.getPassword());
		    System.out.println(ps);
		    
		     /*  ps1.setString(1,rb.getId());
		       ps1.setString(2,rb.getName());
		       ps1.setString(3,rb.getPassword());
		       ps1.setString(4,rb.getRole());
		       */
		       int i=ps.executeUpdate();
		       int j=1;
		       if(i>0&&j>0)
		       {
		    	   con.commit();
		    	   response.sendRedirect("/Sportsclub/jsp/success.jsp");
		       }
		    }
		    catch(SQLException se)
		    {
		    	System.out.print(se);
		    }
		     
		
		
		
	}

}
