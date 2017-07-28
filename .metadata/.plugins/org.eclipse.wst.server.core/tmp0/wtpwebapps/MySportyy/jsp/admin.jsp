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
	String s="<h1>Access Denied!!!</h1><br>Please do login first.<br><a href='/Sportsclub/jsp/user4.jsp'>Home Page</a>" ;


%>
<%=s %>
<% }else 

{  
	%>
	
	<jsp:include page="header.jsp"></jsp:include>
	<script type="text/javascript">
function aa()
{
document.write("alkdjk");

}
function display(entity)
{
	var x;
	

	if(XMLHttpRequest)
	{
		x=new XMLHttpRequest();
		
	}
	else
		{
		x=new ActiveXObject("Microsoft.XMLHTTP");
	 
		}
	x.onreadystatechange=function()
	{
		if(x.readyState==4&&x.status==200)
			{
			
			   var info=x.responseText;
			   document.getElementById("msgtxt").innerHTML=info;
			}
	};
	
	x.open("GET", "/Sportsclub/jsp/AjaxDisp.jsp?ent="+entity,"true");
	//x.open("GET", "/Sportsclub/jsp/newmessage.jsp","true");
	//x.open(, url, async, username, password)
	//x.open("GET", rl, async, username, password)
	x.send();
	//alert(x);

	}
	


</script>


	<div id="templatemo_wrapper" style="height: 800px">
	<div id="tempelatemo_main">
	<h3>Welcome <%=hs.getAttribute("username") +" <a style='Font-size:xx' href='/Sportsclub/LoginServ'>(Logout)</a>" %></h3>
	
	<div id="msgtxt" class="img_frame img_frame_12 img_nom img_fl"style="font-size: 16px;box-shadow:grey 8px 8px 8px;line-height: 30px;height:250px;width:70%"><span></span>
 Hi, Admin. This panel provides you functionality to manage your users and website too. Make sure before changing any information in database because it can not be undone.
	
        </div>
	
	<div class="half right"style="font-size: 16px;box-shadow:grey 8px 8px 8px;height:250px;width:25% ">
			<h3>view Website Users</h3>
			
	 <ul>
 		<li>	<input type="button" value="Players List" onclick="display('player');"> </li>
 			<li ><input type="button" value="Coachs List" onclick="display('coach');">  </li>
            <li> <input type="button" value="Players List" onclick="display('expert');"> </li> 
            <!--  <li> <input type="button" value="Users List" onclick="display('user');"> </li>
  -->
 </ul>	</div>
 <div><br></div>
	<div class="img_frame img_frame_12 img_nom img_fl"style="font-size: 16px;box-shadow:grey 8px 8px 8px;line-height: 30px;height:250px;width:70%"><span></span>
            <img src="/Sportsclub/images/templatemo_image_02.jpg" alt="Model Girl 2">
        </div>
	<div class="half right"style="font-size: 16px;box-shadow:grey 8px 8px 8px;height:250px;width:25%">
	<h3> Manage Enteties</h3>
<ol>
     
		<li><a href="/Sportsclub/jsp/newmessage.jsp"> Ask to  Expert</a> </li>
		<li><a href="/Sportsclub/jsp/adminUpdate.jsp"> Update User Profile</a></li>
		<li><a href="/Sportsclub/jsp/delete.jsp">Delete User</a></li>
	
		<li><a href="/Sportsclub/jsp/conv4.jsp">Conversations</li>
		<li><a href="/Sportsclub/jsp/requests.jsp">View Requests</li>
	
</ol>	
	
	
	
	
	
	
	
	</div>
	
	
	
	</div>
	</div>
	
		
	<jsp:include page="footer.jsp"></jsp:include>
<% }%>