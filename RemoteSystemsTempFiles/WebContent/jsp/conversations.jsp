<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.dbutil.CrudOperation"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Convertations</title>
</head>
<body>

<%
HttpSession hs;
hs=request.getSession(false);
Connection con=CrudOperation.createConnection();
PreparedStatement ps;
ResultSet rs;

String conv=(String) hs.getAttribute("userinfo");
String q="select * from message where senderid='"+conv+"' or recieverid='"+conv+"' group by senderid Order by timee Asc";
ps=con.prepareStatement(q);
rs=ps.executeQuery();
while(rs.next())
{
	if(!rs.getString("senderid").equals(conv))
	{
	
	
%>
<h3><%= rs.getString("senderid") %></h3></em><br>
<%=rs.getString("message") %>
<h6 align="right"><%= rs.getTimestamp("timee") %></h6>
<%
	}
}

%>





</body>
</html>