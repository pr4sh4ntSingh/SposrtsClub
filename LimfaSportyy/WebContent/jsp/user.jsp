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
 /*  Connection con=null;
  con=CrudOperation.createConnection();
  PreparedStatement ps;
  ResultSet rs;
  String rs="select *ffgvvv"
   */
  %>
  <jsp:include page="header.jsp"></jsp:include>
  <%-- <div id="bigger_border">
 
    <div id="big_border">
 <h3>Hello <%=hs.getAttribute("username") %>
 <%=hs.getAttribute("userrole") %> </h3> 
  <br>
  twoo
  mkmsk<br>
   </div>
  
 
  <div id="half<!-- style="position: relative; top:0px; left:800px; width:150px; border: 2" -->
 <th><red> User Activities</red> </th>
 <ul>
 			<li> Players List</li>
 			<li>Coach List <li>
            <li> Experts List</li> 
 
 </ul>
  
  </div>
  

</div> --%>

<div id="templatemo_wrapper">
				<div id="templatemo_main">
	             <h3> Welcome User</h3>
	  <div class=half left style="font-size: 16px;box-shadow:grey 8px 8px 8px; line-height: 20px" >
	  Welcome to the our Sportsclub. Here we provide you worldclass facilities to render the best in you.Always feel free to ask our experts, coaches and players.For this tremendous 
	  service ,all what you have to do is just login. We recomend you to accept our membership and feel proud to be a part of international trend setter club.
	  
	  
	  </div>
	
	<div class="one_fourth right shadow"  style="font-size: 16px;box-shadow:grey 8px 8px 8px;">
	<th><red> User Activities</red> </th>
 <ul>
 			<li> Players List</li>
 			<li>Coach List <li>
            <li> Experts List</li> 
             <li> Update Profile</li>
 
 </ul>
					
	</div>

	
	<div class="one_fourth right shadow" style="font-size: 16px">
	    <h3> Counselling</h3>
<ol>
     
		<li>Ask to Expert</li>
		<li>Ask to Coach</li>
		<li>Ask to Players</li>
</ol>	
	</div>
					</div>




</div>

<jsp:include page="footer.jsp"></jsp:include>
<% } %>