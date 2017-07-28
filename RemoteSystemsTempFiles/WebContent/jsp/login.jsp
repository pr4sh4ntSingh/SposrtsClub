<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" href="/Sportsclub/css/nps.css"/>
<link rel="stylesheet" href="/Sportsclub/css/menu.css"/>
<link rel="stylesheet" href="/Sportsclub/css/temp.css"/>
<script type="text/javascript">function fotter()
{
	document.write('<div id="footer">&copy; SportssClub | <a href="disclaimer.htm">Disclaimer</a> | <a href="/Sportsclub/jsp/query.jsp">Webmail</a> | </br>Powered by: <a target="_blank" href=" #><span class="bluFnt"><span class="redfnt"></span></span></a><a target="_blank" href="#"><span class="redfnt"></span><span class="bluFnt">Club Administrator</span> </a> </div>')
}</script>
</head>
<body bgcolor="olive">

		 <div id="whole_data">
		

					<section id="top_name">
					 <img src="logo.gif" height=150px  align=left style="padding-left:150px; padding-top:0px;padding-bottom:0px" >
					 <img src="logo2.jpg " height=150px align=right style="padding-right:150px; padding-top:0px;padding-bottom:0px" >
					<div Style=" font:BOLd 40px Elephant; color:white; padding:20px"> Limfa Sportss Club</div>
					  <footer><h3 style="color:cyan; text-aign:left"><i>Re-Defining Sportss</i> </h3></footer>
					</section>
<!--   Menu ---------------------------------------------------------------------------------->					
<div id='cssmenu'>
<ul>
   <li class='active'><a href='index.html'>Home</a></li>
   <li class='has-sub'><a href='#'><span>Facilities</span></a>
      <ul>
         <li><a href='#'><span>Kits</span></a></li>
         <li><a href='#'><span>Expert's help</span></a></li>
         <li class='last'><a href='#'><span> Cards</span></a></li>
      </ul>
   </li>
   <li class='has-sub'><a href='#'><span>Games</span></a>
      <ul>
         <li><a href=#><span>Cricket</span></a></li>
		 <li><a href=#><span>Hockey</span></a></li>
		          <li><a href=#><span>Football</span></a></li>
         <li class='last'><a href='#'><span>Fifa fever</span></a></li>
      </ul>
   </li>
   <li class='has-sub'><a href='#'><span>Services</span></a>
      <ul>
         <li><a href=#><span>Tournaments</span></a></li>
		 <li><a href=#><span>Coming Tournaments</span></a></li>
         <li class='last'><a href='#'><span>Results</span></a></li>
      </ul>
   </li>
    <li class='has-sub'><a href='#'><span>Login</span></a>
      <ul>
         <li><a href=#><span>User login</span></a></li>
		 <li><a href=#><span>Coach Login</span></a></li>
         <li class=#><a href='#'><span>Player Login</span></a></li>
      </ul>
   </li>
   
   <li class='has-sub'><a href=#><span>About us </span></a></li>
     
     
   
   <li class='last'><a href='#'><span>Contact us</span></a></li>
</ul>
</div>

<!------------------menu end------------------------->
<div style="top:300px; left: 550px; position: absolute;">
 <form action="/Sportsclub/LoginServ" method="post">
 <table>
 <tr><th>Username</th> <td><input type="text" name="id" size="20"></td></tr>
 <tr><th>password</th> <td><input type="password" name="password"></td> </tr>
 <tr><td colspan="2"><a href="/Sportsclub/jsp/registration.jsp">New Registration</a></td></tr>
 <tr><th colspan="2"><input type="submit" name="submit" id="submit" value="Log In" /></th>
 </table>
 </form>
</div>
<footer style="background-color: maroon; width: 99.5%; bottom:0px; text-align:center;top:600px; position:absolute;border-radius:5px ">
<script type="text/javascript">fotter();</script></footer>
</body>
</html>