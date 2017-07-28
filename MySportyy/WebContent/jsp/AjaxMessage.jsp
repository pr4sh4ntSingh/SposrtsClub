<%@page import="java.util.Date"%>
<%@page import="java.util.Calendar"%>
<%@page import="com.dbutil.CrudOperation"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<% 
HttpSession hs;
hs=request.getSession(false);

String ent=request.getParameter("ent");
//String ent="ankita.clash@gmail.com";
PreparedStatement ps,ps2;
ResultSet rs,rs2;
Connection con;
con=CrudOperation.createConnection();
String viewer=(String) hs.getAttribute("userinfo");
hs.setAttribute("reciever", ent);
String q="select * from  message where (senderid='"+viewer+"' or recieverid='"+viewer+"') AND (senderid='"+ent+"' OR recieverid='"+ent+"') order by timee Asc";
//System.out.println(q);
ps=con.prepareStatement(q);
rs=ps.executeQuery();

%>

<h3>view conversation between <%=viewer %> and <%=ent %> </h3>
 
<% while(rs.next())
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
	} %>
<form action="/Sportsclub/ConversationMessage" method="post"><h3>New message</h3>
		<textarea name="newmessage" cols="80" rows="5">Write your message to <%=ent %></textarea>
		
		<input type="submit" value="send">
</form>

