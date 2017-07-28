package com.Servelets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dbutil.CrudOperation;

/**
 * Servlet implementation class NewMessage
 */
@WebServlet("/NewMessage")
public class NewMessage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewMessage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	  PrintWriter pw=response.getWriter();
		HttpSession hs;
		hs=request.getSession(false);
		//String sender=(String)hs.getAttribute("userid");
		Connection con=CrudOperation.createConnection();
		PreparedStatement ps;
		ResultSet rs;
		String q="Select userid,name from registration ";
		try{
		ps=con.prepareStatement(q);
		rs=ps.executeQuery();

		int size=rs.getFetchSize();

		System.out.println(size);
		while(rs.next())
		{
	pw.print(rs.getString("name"));
	
	}
		}
		catch(SQLException se)
		{
			System.out.print(se);
		}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
