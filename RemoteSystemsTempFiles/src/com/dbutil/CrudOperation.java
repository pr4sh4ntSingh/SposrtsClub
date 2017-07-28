package com.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bean.RegistrationBean;


public class CrudOperation {
	
	static private ArrayList<RegistrationBean> recordList=null;
	static private PreparedStatement ps;
	static private ResultSet rs;
	
	public static Connection con=null;
	
	public static Connection createConnection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sportclub","root","hello");

		}
				catch(ClassNotFoundException|SQLException cse)
		{
			System.out.println(cse);
		}
	return con;	
	}
	
	public static ArrayList<RegistrationBean> userDetail()
	{
		String  q="Select*from registration";
	 	recordList=new ArrayList<RegistrationBean>();
		 RegistrationBean rb;
		
		try{ 
		con=CrudOperation.createConnection();
	     ps=con.prepareStatement(q);
	     rs=ps.executeQuery();
	     while(rs.next())
	     {
	    	 rb=new RegistrationBean();
	    	 rb.setId(rs.getString("userid"));
	    		rb.setName(rs.getString("name"));
	    		rb.setGame(rs.getString("game"));
	    		//rb.setPhone(Long.parseLong(rs.getString("phone")));
	    		rb.setIdtype(rs.getString("idtype"));
	    		rb.setIdno(rs.getString("idno"));
	    		rb.setRole(rs.getString("role"));
	    		rb.setGender(rs.getString("sex"));
	    		rb.setAddr(rs.getString("address"));
	    		recordList.add(rb);
	     }

	     
		}
		catch(SQLException se)
		{
			System.out.print(se);
		}
	    return(recordList);
	}

	public static ArrayList<RegistrationBean> adminRequests()
	{
		String  q="Select*from registration where isverified=0";
	 	recordList=new ArrayList<RegistrationBean>();
		 RegistrationBean rb;
		
		try{ 
		con=CrudOperation.createConnection();
	     ps=con.prepareStatement(q);
	     rs=ps.executeQuery();
	     while(rs.next())
	     {
	    	 rb=new RegistrationBean();
	    	 rb.setId(rs.getString("userid"));
	    		rb.setName(rs.getString("name"));
	    		rb.setGame(rs.getString("game"));
	    		rb.setPhone(Long.parseLong(rs.getString("phone")));
	    		rb.setIdtype(rs.getString("idtype"));
	    		rb.setIdno(rs.getString("idno"));
	    		rb.setRole(rs.getString("role"));
	    		rb.setGender(rs.getString("sex"));
	    		rb.setAddr(rs.getString("address"));
	    		recordList.add(rb);
	     }

	     
		}
		catch(SQLException se)
		{
			System.out.print(se);
		}
	    return(recordList);
	}
	public ArrayList<RegistrationBean> getAdminBean()
	{
		
		return(recordList);
	}
	
	
	public static int[] sort(int[] ank)
	{
		int j;
		for(int i=1;i<ank.length;i++)
	    {
	    int item=ank[i];
	       for( j=i-1;j>=0 && ank[j]>item;j--)
	       {  ank[j+1]=ank[j];}
	    ank[j+1]=item;
	    }
		return(ank);
	    }
		
		
	}


