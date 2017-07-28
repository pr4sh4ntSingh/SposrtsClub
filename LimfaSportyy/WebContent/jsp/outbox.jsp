

<%@page import="com.dbutil.ConvRedirect"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.sql.Time"%>
<%@page import="com.dbutil.CrudOperation"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>

<%@page import="java.sql.Connection"%>
<%@page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Outbox</title>
<%@ include file="/html/header.html" %>
<script>
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
	
	x.open("GET", "/Sportsclub/jsp/AjaxMessage.jsp?ent="+entity,"true");
	//x.open("GET", "/Sportsclub/jsp/newmessage.jsp","true");
	//x.open(, url, async, username, password)
	//x.open("GET", rl, async, username, password)
	x.send();
	//alert(x);

	}
	
function	set(){
	<%
	 ConvRedirect.setRedirectedFrom("/Sportsclub/jsp/outbox.jsp");
	 
	%>
	alert("ndkdjk");
	
}

</script>




<%
HttpSession hs;
hs=request.getSession(false);
String reciever=(String) hs.getAttribute("redirectFromConversationMessage");
if(reciever==null)
{
	
}
else{
	%>
	<script type="text/javascript">
	
	
	display('<%=reciever %>');
	
	
	</script>
	
	
	
	
	<% 
}




PreparedStatement ps,ps2;
ResultSet rs,rs2;
Connection con;
con=CrudOperation.createConnection();
String conv=(String) hs.getAttribute("userinfo");
String q="select * from message where senderid='"+conv+"' group by recieverid order by timee asc";
String q2="select * from message where senderid='"+conv+"' group by recieverid order by timee asc";
System.out.println(q);
ps=con.prepareStatement(q);
rs=ps.executeQuery();
ps2=con.prepareStatement(q2);
rs2=ps2.executeQuery();

%>
<div id="templatemo_wrapper" style="height: 800px">
	<div id="tempelatemo_main">
	<h3>Welcome <%=hs.getAttribute("username") %></h3>
	<a href="/Sportsclub/LoginServ" >Logout</a>
	
	<div id="msgtxt" class="img_frame img_frame_12 img_nom img_fl"style="font-size: 16px;box-shadow:grey 8px 8px 8px;line-height: 30px;width:70%; "><span></span>
	You have recently sent message to these people. Their last messages are following. Click on the reciever's name to show full conversation.
	
	<em><h3>
<%

while(rs.next())
{
	//if(!rs.getString("recieverid").equals(conv))

		
		
	Date day;
	Date time;
	day=rs.getTimestamp("timee");
	Date now=new Date();
	Calendar nowCal=Calendar.getInstance();
	Calendar thenCal=Calendar.getInstance();
thenCal.setTime(day);
//System.out.println(thenCal.get(Calendar.HOUR));

//System.out.println(thenCal.get(Calendar.HOUR_OF_DAY)-nowCal.get(Calendar.HOUR_OF_DAY)+"jkjk");
%>
<div id="messagebox" style="border: .9pt solid grey ">
<h3><%=rs.getString("senderid") %></h3> <h4><tt><%=rs.getString("message") %></tt></h4>

<% 
if(thenCal.get(Calendar.DATE)==nowCal.get(Calendar.DATE))
{
      int hour=nowCal.get(Calendar.HOUR_OF_DAY)-thenCal.get(Calendar.HOUR_OF_DAY);
        {
					if(hour==0)
					{
						int min=nowCal.get(Calendar.MINUTE)-thenCal.get(Calendar.MINUTE);
						%>
						<h5 align="right"><tt><%=min %> minutes ago</tt></h5>
						<%
					}
					else{
					%>
		      <h5 align="right"><tt>today, <%=hour %> hours ago</tt></h5>
                   
			<%
					}
			}
}		else{	%>




<h5 align="right"><%=String.format("%ta,%td %tB",day,day,day) %>@ <%=String.format("%tI:%tM %tp",day,day,day) %></h5>
<%} %>	
</div>
<%
	}

%>
	</div>
	

	
	<div class="half right"style="font-size: 16px;box-shadow:grey 8px 8px 8px;width:25%; ">
			<h3>See Full Conversation</h3>
			
	 <ul>
	<a href="/Sportsclub/Reset" onClick="set();">Go Home</a>
	<% while(rs2.next())
	 {
	 if(!rs2.getString("recieverid").equals(conv))
	 {
	 %>
 		<li>	<input type="button" value="<%=rs2.getString("recieverid") %>" onclick="display('<%=rs2.getString("recieverid") %>');"> </li>
 	<%} 	}	
 %>
 </ul>	</div>
 </div>
 </div>
 
 <%@ include file="/html/footer2.html" %>




