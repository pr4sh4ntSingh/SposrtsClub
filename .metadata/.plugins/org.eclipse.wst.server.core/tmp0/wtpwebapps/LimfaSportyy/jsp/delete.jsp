<%@page import="com.bean.RegistrationBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.dbutil.CrudOperation"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Delete</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ include file="/html/header.html" %>

<div id="templatemo_wrapper" >
	<div id="tempelatemo_main">
	
	<%
	
	ResultSet rs;
	//PreparedStatement ps;
	
	Connection con;
	con=CrudOperation.createConnection();
	String sql="Select*from registration";
    //ps=con.prepareStatement(sql);
   ArrayList<RegistrationBean> fromdb=CrudOperation.userDetail();
if(request.getParameter("message")==null)
   {}
else{
   %><script>
    alert("<%=request.getParameter("message")%>");</script>
      
    <%} %>  
      <h3>Welcome <%=hs.getAttribute("username") %></h3>
	<a href="/Sportsclub/LoginServ" >Logout</a>
	<div id="msgtxt" class="img_frame img_frame_12 img_nom img_fl"style="font-size: 16px;box-shadow:grey 8px 8px 8px;line-height: 30px;width:70%; "><span></span>
	You can delete users, players, coach from this panel. Remember, deleted information can not be recovered.
   <form method="get" action="/Sportsclub/DeleteServ">
  <table>
  <tr><th>S.No </th><th>Name</th><th>Userid</th><th>Userrole</th><th>Select</th></tr>
   <% 

   
   for(int i=0;i<fromdb.size();i++)
   {
	   RegistrationBean rb;
	   rb=fromdb.get(i);
	%>
	<tr><td><%=i+1 %>).</td><td><%=rb.getName() %><td><%=rb.getId() %></td><td><%=rb.getRole() %></td><td><input type="checkbox" name="del" value="<%=rb.getId()%>"></td>
	
	<%    
   }
	
	

	%>
	
	
   </table>
   <input type="Submit" value="Delete" >
   </form>
	</div>
	<div class="half right"style="font-size: 16px;box-shadow:grey 8px 8px 8px;height:250px;width:25%">
	<h3> Manage Enteties</h3>
<ol>
     
		<li><a href="/Sportsclub/jsp/newmessage.jsp"> Ask to  Expert</a> </li>
		<li><a href="/Sportsclub/jsp/update.jsp"> Update User Profile</a></li>
		<li><a href="/Sportsclub/jsp/delete.jsp">Delete User</a></li>
		<li>Love You</li>
		<li><a href="/Sportsclub/jsp/outox.jsp">Conversations</li>
	
</ol>	
	
	
	
	
	
</html>
<%}%>