

<%@page import="sun.management.Sensor"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.dbutil.ConvRedirect"%>
<%@page import="java.time.format.DateTimeFormatterBuilder"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.util.Timer"%>
<%@page import="java.sql.Time"%>
<%@page import="java.util.Date"%>
<%@page import="java.sql.SQLException"%>
<%@page import="com.dbutil.CrudOperation"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>

<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Inbox</title>
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
		 ConvRedirect.setRedirectedFrom("/Sportsclub/jsp/conv4.jsp");
		 
		%>
		
		
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

String q2="(select senderid from message where recieverid='"+conv+"' or senderid='"+conv+"'and senderid!=recieverid group by senderid )union(select recieverid from message where recieverid='"+conv+"' or senderid='"+conv+"'and senderid!=recieverid group by recieverid)";
System.out.println(q2);
ArrayList<String> senderName=new ArrayList<String>();

try{

ps2=con.prepareStatement(q2);
rs2=ps2.executeQuery();
while(rs2.next())
{
	senderName.add(rs2.getString("senderid"));
}

%>
<div id="templatemo_wrapper" style="height:800px" >
	<div id="tempelatemo_main">
	<h3>Welcome <%=hs.getAttribute("username") %></h3>
	<div class="half right"style="font-size: 16px;box-shadow:grey 8px 8px 8px;width:25%; ">
			<h3>See Full Conversation</h3>
		
			
	 <ul>
	 	<a href="/Sportsclub/Reset" onClick="set();">Go Home</a>
	<%for(int i=0;i<senderName.size();i++)
	 {
		
		String name=senderName.get(i);
		
		if(name.equals(conv))
		{
			//System.out.println("/////sjdksks"+conv);
		}
		else{
	
	 
	 %>
 		<li>	<input type="button" value="<%=senderName.get(i) %>" onclick="display('<%=senderName.get(i)%>');"> </li>
 		       
 		
 	<%
	 
		}
	 
	 }	


	
	
	
 %>
 </ul>	</div>
	
	<div id="msgtxt" class="img_frame img_frame_12 img_nom img_fl"style="font-size: 16px;box-shadow:grey 8px 8px 8px;line-height: 30px;width:70%; "><span></span>
	These people send message to you. Their last messages are following. Click on the sender's name to show full conversation.
	
	<em><h3>
<%

for(int i=0;i<senderName.size();i++)
{
	//if(!rs.getString("recieverid").equals(conv))
String q="Select * from message where (recieverid='"+conv+"' or senderid='"+conv+"')  and (senderid='"+senderName.get(i)+"' or recieverid='"+senderName.get(i)+"')and timee in(Select max(timee) from message where (recieverid='"+conv+"' or senderid='"+conv+"')  and (senderid='"+senderName.get(i)+"' or recieverid='"+senderName.get(i)+"'))";
System.out.println(q);
ps=con.prepareStatement(q);

rs=ps.executeQuery();		
		rs.next();
	Date day;
	Date time;
	day=rs.getTimestamp("timee");
	Date now=new Date();
	Calendar nowCal=Calendar.getInstance();
	Calendar thenCal=Calendar.getInstance();
thenCal.setTime(day);


%>
<div id="messagebox" style="border: .9pt solid grey ">
<%
if(rs.getString("recieverid").equals(conv))
{
%>
<h3><%=rs.getString("senderid") %></h3><h6>recieved</h6>
<%}
else{%>

<h3><%=rs.getString("recieverid") %></h3><h6>sent</h6>

<%} %>
 <h4><tt><%=rs.getString("message") %></tt></h4>

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
	
}}
catch(SQLException se)
{
	System.out.println(se);
   //System.out.print();
}
%>
	</div>
	

	
	
 </div>
 </div>
</head>
</html>

