<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.dbutil.CrudOperation"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%//gtgt
    HttpSession hs;
    String s;
hs=request.getSession(false);
if((String)hs.getAttribute("userinfo")==null)
{
	//String s="<h1>Access Denied!!!</h1><br>Please do login first.<br><a href='/Sportsclub/index.html'>Home Page</a>" ;
s="Guest";
}
else
	{s=(String)hs.getAttribute("username");}
%>

<% 

	%>
	
	<jsp:include page="header.jsp"></jsp:include>
	<script type="text/javascript">
function aa()
{
document.write("alkdjk");

}
function validate()
{
var ent="<%=hs.getAttribute("userinfo")%>";
if(ent=="null")
	{
	alert("You must login to start a conversation");
	return false;
	}
	
	
	
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
					
<section id="photo">
					<center>
<img src="g1.jpg" name="slide" style="position:center; margin:0; padding:0,alt="" width=80% height=450px"></center>
					<script type="text/javascript">

var step=1
function slideit(){
//if browser does not support the image object, exit.
if (!document.images)
return
document.images.slide.src=eval("image"+step+".src")
if (step<6)
step++
else
step=1
//call function "slideit()" every 2.5 seconds
setTimeout("slideit()",2500)
}
slideit()

	</script>
					</section>
					</section>
					<div id="strip" style="background:#660033" padding-b>
			<marquee direction="left" width="100%" scrollamount="5" onmouseover="this.stop()" onmouseout="this.start()" style="padding-top:20px">
        <b style="background:#660033; font-variant:small-caps; font-size:14px;">
					         <a href="#"><i>Subscribe and get updated on your favorite Players, Sports and many more.____For best view of the site we suggest "Google Chrome" and "SAFARI"</i></a>
					</marquee>
					
					</div>


	<div id="templatemo_wrapper" style="height: 600px">
	<div id="tempelatemo_main">
	<%if (s.equals("Guest")){ %>
	<h3>Welcome <%=s %></h3>
	<%} else
		{%>
		<h3>Welcome <%=hs.getAttribute("username") +" <a style='Font-size:xx' href='/Sportsclub/LoginServ'>(Logout)</a>" %></h3>

		
		<% }%>
	
	<div id="msgtxt" class="img_frame img_frame_12 img_nom img_fl"style="font-size: 16px;box-shadow:grey 8px 8px 8px;line-height: 30px;height:250px;width:70%"><span></span>
 Welcome to our Sportsclub. Here we provide you worldclass facilities to render the best in you.Always feel free to ask our experts, coaches and players.For this tremendous 
	  service ,all what you have to do is just login. We recomend you to accept our membership and feel proud to be a part of international trend setter club.
	
        </div>
	
	<div class="half right"style="font-size: 16px;box-shadow:grey 8px 8px 8px;height:250px;width:25% ">
			<h3>User Activities</h3>
			
	 <ul>
 		<li>	<input type="button" value="Players List" onclick="display('player');"> </li>
 			<li ><input type="button" value="Coachs List" onclick="display('coach');">  </li>
            <li> <input type="button" value="Experts List" onclick="display('expert');"> </li> 
   
 
 </ul>	</div>
 <div><br></div>
	<div class="img_frame img_frame_12 img_nom img_fl"style="font-size: 16px;box-shadow:grey 8px 8px 8px;line-height: 30px;height:250px;width:70%"><span></span>
            <img src="/Sportsclub/images/templatemo_image_02.jpg" alt="Model Girl 2">
        </div>
	<div class="half right"style="font-size: 16px;box-shadow:grey 8px 8px 8px;height:225px;width:25%">
	<h3> Ask to our experts</h3>
<ol>
     
		<li><a href="/Sportsclub/jsp/newmessage.jsp" onclick="return(validate());">New Conversation</a> </li>
		 <li><a href="/Sportsclub/jsp/conv4.jsp"  onclick="return(validate());">All conversations</a></li> 
		<li><a href="/Sportsclub/jsp/inbox.jsp" onclick="return(validate());" >Inbox</a></li>
		<li><a href="/Sportsclub/jsp/outbox.jsp" onclick="return(validate());">OutBox</a></li>
		 <li><a href="/Sportsclub/jsp/update.jsp"  onclick="return(validate());">Update Profile</li> 
</ol>	
	
	
	
	
	
	
	
	</div>
	
	
	
	</div>
	</div>
	
		
	<jsp:include page="footer.jsp"></jsp:include>