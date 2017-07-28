<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.dbutil.CrudOperation"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%//gtgt
    HttpSession hs;
hs=request.getSession(false);
if((String)hs.getAttribute("userinfo")==null)
{
	String s="<h1>Access Denied!!!</h1><br>Please do login first.<br><a href='/Sportsclub/index.html'>Home Page</a>" ;


%>
<%=s %>
<% }else 

{  
	%>
	
	<jsp:include page="header.jsp"></jsp:include>
	
	<div id="bigger_border2" Style="width:80%;margin-bottom:8px; margin-left:100px;box-shadow:grey 8px 8px 8px;">
	
	       <div id="big_border2"style="width:60%;font-size: 16px;
margin:0px;
padding:0px;
float:left;
background-color:none ;

color:#33333a;
box-shadow:grey 8px 8px 8px;">


  Welcome to the our Sportsclub. Here we provide you worldclass facilities to render the best in you.Always feel free to ask our experts, coaches and players.For this tremendous 
	  service ,all what you have to do is just login. We recomend you to accept our membership and feel proud to be a part of international trend setter club.
	  
	       
	       </div>
	       
	       
	       <div id="news2" style="margin:10px;width:30%;font-size: 16px; float:right;
padding:20px;
box-shadow:grey 8px 8px 8px;"><th><red> User Activities</red> </th>
 <ul>
 			<li> Players List</li>
 			<li>Coach List <li>
            <li> Experts List</li> 
             <li> Update Profile</li>
 
 </ul>
					
	       
	       
	       <div>
	       
	       
	       </div>
	</div>
	
	
	</div>
	
	<jsp:include page="footer.jsp"></jsp:include>
<% }%>