<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="com.dbutil.IsSet"%>
<%@page import="com.bean.RegistrationBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.dbutil.CrudOperation"%>
<%@page import="java.sql.Connection"%>
<%//gtgt
    HttpSession hs;
hs=request.getSession(false);
if((String)hs.getAttribute("userinfo")==null)
{
	String s="<h1>Access Denied!!!</h1><br>Please do login first.<br><a href='/Sportsclub/jsp/user4.jsp'>Home Page</a>" ;


%>
<%=s %>
<% }else 

{  
	%>
<html>
<head>
<title>Delete</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ include file="/html/header.html" %>

<div id="templatemo_wrapper" >
	<div id="tempelatemo_main">

<form method="post" action="/Sportsclub/DeleteServ">
<table>
<tr><th>S.No </th><th>Name</th><th>Userid</th><th>Userrole</th><th>Select</th></tr>
<%  
Connection con;
con=CrudOperation.createConnection();
ArrayList<RegistrationBean> fromdb=CrudOperation.userDetail();

for(int i=0;i<fromdb.size();i++)
{
	RegistrationBean rb;
	rb=fromdb.get(i);
%>

<tr><td><%=i+1 %>).</td><td><%=rb.getName() %><td><%=rb.getId() %></td><td><%=rb.getRole() %></td><td><input type="radio" name="update" value="<%=rb.getId()%>"></td>
<%}%>
</table>
<input type="submit" Value="Update">
</form>
</div>
</div>


<%} %>