package com.Servelets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dbutil.CrudOperation;
import com.dbutil.IsSet;

/**
 * Servlet implementation class DeleteServ
 */
@WebServlet("/DeleteServ")
public class DeleteServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PreparedStatement ps,ps1;
	Connection con;
	HttpSession hs;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	int flag=0;	
	String s=" ";
String delete[]=request.getParameterValues("del");
String q="delete from login where userid=?";
String q1="Delete from registration where userid=?";
System.out.println(q);
con=CrudOperation.createConnection();
try{
con.setAutoCommit(false);
ps=con.prepareStatement(q);
ps1=con.prepareStatement(q1);


for(int i=0;i<delete.length;i++)
{
	ps.setString(1,delete[i]);
	ps1.setString(1,delete[i]);
	ps.addBatch();
	ps1.addBatch();
}
int result[]=ps.executeBatch();
int result1[]=ps1.executeBatch();
for(int c=0;c<result.length;c++)
{  
	s=s+" "+delete[c];
	if(result[c]<0)
	{
		flag=1;
		break;
	}
	if(result1[c]<0)
	{
		flag=1;
		break;
	}
}
if(flag==0){
con.commit(); 
    response.sendRedirect("/Sportsclub/jsp/delete.jsp?message="+s+"has been deleted");
    
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
		/*hs=request.getSession(false);
		System.out.println(request.getParameter("update"));
		String s=request.getParameter("update");
		hs.setAttribute("userfromadmin", s);
		*/
		IsSet.fromAdminUpdate();
		IsSet.setEntity(request.getParameter("update"));
		
		response.sendRedirect("/Sportsclub/jsp/update.jsp");
		
		
		
	}

}
