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
@WebServlet("/RegistrationServ")
public class RegistrationServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection con=null;

	private PreparedStatement ps,ps1;
    private RegistrationBean rb=new RegistrationBean();
       
   
    public RegistrationServ() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	

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
	    
	String regisq, loginq;
	
	  
		  regisq="insert into registration values(?,?,?,?,?,?,?,?,?,?,?)";
		   loginq="insert into login values(?,?,?,?,?)";
	
	   
	  
	    try
	    {
	    	con.setAutoCommit(false);
	     	ps=con.prepareStatement(regisq);
	      
			
	       ps.setString(1,rb.getId());
	       ps.setString(2,rb.getName());
	       ps.setString(3,rb.getGame());
	       ps.setLong(4,rb.getPhone());
	       ps.setString(5,rb.getIdtype());
	       ps.setString(6,rb.getIdno());
	       ps.setString(7,rb.getRole());
	       
	       ps.setString(8,rb.getGender());
	       ps.setString(9,rb.getAddr());
	       ps.setString(10,rb.getPassword());
	       if(rb.getRole().equals("user"))
	       {ps.setInt(11,1);}
	       else 
	    	   ps.setInt(11,0);
	       
	       ps1=con.prepareStatement(loginq);
	       ps1.setString(1,rb.getId());
	       ps1.setString(2,rb.getName());
	       ps1.setString(3,rb.getPassword());
	       ps1.setString(4,rb.getRole());
	       if(rb.getRole().equals("user"))
	       {ps1.setInt(5,1);}
	       else 
	    	   ps1.setInt(5,0);
	       
	       
	       int i=ps.executeUpdate();
	       int j=ps1.executeUpdate();
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

	


