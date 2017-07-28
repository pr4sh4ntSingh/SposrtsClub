<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
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
<title>New Message</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ include file="/html/header.html" %>

<div id="templatemo_wrapper" >
	<div id="tempelatemo_main">
<h3>Hello <%=hs.getAttribute("username") +" <a style='Font-size:xx' href='/Sportsclub/LoginServ'>(Logout)</a>" %></h3>
<form action="/Sportsclub/Messaging" method="post">
  <% 

String sender=(String)hs.getAttribute("userid");
Connection con=CrudOperation.createConnection();
PreparedStatement ps;
ResultSet rs;
String q="Select userid,name from registration ";
try{
ps=con.prepareStatement(q);
rs=ps.executeQuery();
%>

  <SELECT name="reciever" onchange="textbox(this.value);">
<option>SELECT reciever</option>
<%
while(rs.next())
{
		%>
<option VALUE="<%=rs.getString("userid")   %>">	<%=rs.getString("name") %> </option>
<% 
}
}
catch(SQLException se)
{
	System.out.print(se);
}
%>


</Select>
<div id="textbox"  style="visibility: visible;" >

<textarea name="message" rows="10" cols="30">Write your message to</textarea>

</div>
<input type="Submit" >
</form>
</div>
</div>

<%@ include file="/html/footer2.html" %>
<%} %>

