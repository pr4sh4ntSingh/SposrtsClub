<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:include page="header.jsp"></jsp:include>



			 <div id="templatemo_main">

       
       
					<nav id= "bigger_border">
		<article id="news">
					
						<form name="mf" action="/Sportsclub/RegistrationServ"  method="post" style="background:white; cellpadding:10px">
						<marquee direction="left" width="100%" scrollamount="3" onmouseover="this.stop()" onmouseout="this.start()" style="padding-top:20px">
        <b style="background:#eeebdd; font-variant:small-caps; font-size:14px;">Please fill genuine informations......</b>
        </marquee>
						<table  cellpadding="10" cellspacing="4"  width="100%">
						<center> 
							<caption align="top"><h2> Registration form</h2> </caption>
						</center>
							<tr>
							<td>NAME </TD>
							<Td><input type="text" name="name"></td>
							</tr>
							<tr>
								<td>Sport Name</TD>
							<Td><input type="text"placeholder="your desired game's name" name="game"></td>
							</tr>
							<tr>
								<td>Email id </TD>
							<Td><input type="email" placeholder="this is your unique id" name="id"></td>
							</tr>
							<tr>
								<td>Contact No. </TD>
							<Td><input type="text" name="phone"></td>
							</tr>
							<tr><td>Id Proof</td>
							<td>	<select name="idtype">
		<option >Select your Id</option>
		<option  value="Driving License</">Driving License</option>
		<option value="Acadamic Certificate">Acadamic Certificate</option>
		<option value="Pan Card ">Pan Card </option>
		<option value="other">Other</option>
		</select></td>
		</tr>
														<tr>
							<td>Id no.</TD>
							<Td><input type="number" name="idno"></td>
							</tr>
							<tr>
								<td>Address </TD>
								<td><textarea rows="3" cols="30" name="address">Type your text here </textarea> </td>
							
							</tr>
							<tr>
								<td>Sex </TD>
							<Td><input type=radio name="gender" value=male Checked>Male
							    <input type=radio name="gender" value=female>female
							</tr>
							<tr>
								<td>Account type </TD>
								<td>	<select name="role">
		<option >Select your Id</option>
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
							
							
							 
													    
						</table>
						<input type="Submit" value="Submit">	
						
							</form>
						</article>
						
						</nav>








<jsp:include page="footer.jsp"></jsp:include>