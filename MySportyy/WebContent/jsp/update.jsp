<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="com.dbutil.IsSet"%>
<%@page import="java.sql.SQLException"%>
<%@page import="com.bean.RegistrationBean"%>
<%@page import="com.dbutil.CrudOperation"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<html>
<head>

<title>Update User Profile</title>
<%@ include file="/html/header.html" %>
<%

Connection con=null;
HttpSession hs;
String sql;
hs=request.getSession(false);
RegistrationBean rb=new RegistrationBean();
if(IsSet.isFromAdminUpdate()==1)
{
sql="select*from registration where userid='"+IsSet.getEntity()+"'";
IsSet.resetFromAdminUpdate();
}
else 
{
 sql="select*from registration where userid='"+hs.getAttribute("userinfo")+"'";}
System.out.println(sql);
ResultSet rs;
PreparedStatement ps;
con=CrudOperation.createConnection();
try{
ps=con.prepareStatement(sql);
rs=ps.executeQuery();
while(rs.next())

{
	rb.setId(rs.getString("userid"));
	rb.setName(rs.getString("name"));
	rb.setGame(rs.getString("game"));
	rb.setPhone(Long.parseLong(rs.getString("phone")));
	rb.setIdtype(rs.getString("idtype"));
	rb.setIdno(rs.getString("idno"));
	rb.setRole(rs.getString("role"));
	rb.setGender(rs.getString("sex"));
	rb.setAddr(rs.getString("address"));
}
}
catch(SQLException se)
{
	System.out.println(se);
}

%>
	 <div id="templatemo_main">

       
       
					<nav id= "bigger_border">
		<article id="news">
					
						<form name="mf" action="/Sportsclub/UpdateServ" method="post" style="background:white; cellpadding:10px">
						<marquee direction="left" width="100%" scrollamount="3" onmouseover="this.stop()" onmouseout="this.start()" style="padding-top:20px">
        <b style="background:#eeebdd; font-variant:small-caps; font-size:14px;">Please fill genuine informations......</b>
        </marquee>
						<table  cellpadding="10" cellspacing="4"  width="100%">
						<center> 
							<caption align="top"><h2> Update Detail</h2> </caption>
						</center>
							<tr>
							<td>NAME </TD>
							<Td><input type="text" name="name" value="<%=rb.getName()%>" ></td>
							</tr>
							<tr>
								<td>Sport Name</TD>
							<Td><input type="text"placeholder="your desired game's name" name="game"  value="<%=rb.getGame()%>"></td>
							</tr>
							<tr>
								<td>Email id </TD>
								<input type="hidden" name="id" value="<%=rb.getId() %>">
							<Td><%=rb.getId() %><h6 style="color: red">This can't be changed</h6> </td>
							</tr>
							<tr>
								<td>Contact No. </TD>
							<Td><input type="text" name="phone"  value="<%=rb.getPhone() %>"></td>
							</tr>
							<tr><td>Id Proof</td>
							<td>	<select name="idtype">
		 <option  value="<%=rb.getIdtype() %>"> <%=rb.getIdtype() %> </option>
		<option  value="Driving License</">Driving License</option>
		<option value="Acadamic Certificate">Acadamic Certificate</option>
		<option value="Pan Card ">Pan Card </option>
		<option value="other">Other</option>
		</select></td>
		</tr>
														<tr>
							<td>Id no.</TD>
							<Td><input type="number" name="idno"  value="<%=rb.getIdno() %>"></td>
							</tr>
							<tr>
								<td>Address </TD>
								<td><textarea rows="3" cols="30" name="address"> <%=rb.getAddr() %> </textarea> </td>
							
							</tr>
							<tr>
								<td>Sex </TD>
							<Td><input type=radio name="gender" value=male Checked>Male
							    <input type=radio name="gender" value=female>female
							</tr>
							<tr>
								<td>Account type </TD>
								<td>	<select name="role">
		<option value="<%=rb.getRole()%>" ><%=rb.getRole() %></option>
		<option value="user">User Account</option>
		<option value="player">Player Account</option>
		<option value="coach ">Coach Account</option>
		<option value="expert">Expert's Account</option>
		</select></td>
		</tr>
							
														<tr>
							<td>Choose Your password </TD>
							<Td><input type="Password" name="password"></td>
							</tr>
							<tr>
							<td>Repeat Your password </TD>
							<Td><input type="Password" name=""></td>
							</tr>
							<tr> 
							<td> <input type="hidden" value="1" name="fromupdate"> </td>
							
							</tr>
							
							 
													    
						</table>
						<input type="Submit" value="Submit">	
						
							</form>
						</article>
						
						</nav>

						<%@ include file="/html/footer2.html" %>