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

import com.dbutil.CrudOperation;



/**
 * Servlet implementation class AjaxDisp
 */
@WebServlet("/AjaxDisp")
public class AjaxDisp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;
	ResultSet rs;
	
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjaxDisp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		con=CrudOperation.createConnection();
		PreparedStatement ps;
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		String strq="Select * from sportclub.player";
		try{
		ps=con.prepareStatement(strq);
		rs=ps.executeQuery();
		while(rs.next())
		{
			pw.print("<table><tr><td>name</td><td>");
			pw.print(rs.getString("name"));
		}
		}
		catch(SQLException se)
		{
			System.out.println(se);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
