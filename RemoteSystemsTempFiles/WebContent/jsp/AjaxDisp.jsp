<%@page import="com.dbutil.CrudOperation"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<%
String ent=(String)request.getParameter("ent");

Connection con;
ResultSet rs;
PreparedStatement ps;
con=CrudOperation.createConnection();
String strq="Select * from "+ent;
ps=con.prepareStatement(strq);
rs=ps.executeQuery();
String tab="<table><tr><th>Name</th><th>Game</th><th>Phone</th><th>Address</th></tr>";

%>
<%= "Our "+ent+"s," %>
<%=tab %>  

<%
while(rs.next())
{

%>

<tr>
<td><%=rs.getString("name")%></td>
<td><%=rs.getString("game")%></td>
<td><%=rs.getString("phone") %></td>
<td><%=rs.getString("address") %>
</td>

</tr>

<% }%>



</table>