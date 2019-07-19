<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Insert title here</title>
<link href="<c:url value="/resources/css/style1.css"/>"rel="stylesheet">
<body background="<c:url value="/resources/images/LTI.jpg"/>"/>
</head>
<body>



				<h3 align=center>Bidder List</h3>
				<hr color="black" size="3" />
				<table border=1   align=center>
						<tr>
						<th>Bidder ID</th>
							<th>Bidder Name</th>
							<th>Contact</th>
							<th>Email ID</th>
							<th>House Number</th>
							<th>City</th>
							<th>State</th>
							<th>Country</th>
							<th>Pin-code</th>
							<th>Password</th>
							
						</tr>

						<!-- loop over and print our customers -->
						<c:forEach var="tempBidder" items="${bidders}">

							<tr bgcolor="grey">
								<td>${tempBidder. bidder_id}</td>
								<td>${tempBidder.bfullname}</td>
								<td>${tempBidder. bcontact}</td>
								<td>${tempBidder.bemail_id }</td>
								<td>${tempBidder.bhouse_no}</td>
								<td>${tempBidder.bcity}</td>
								<td>${tempBidder.bstate}</td>
								<td>${tempBidder.bcountry}</td>
								<td>${tempBidderbpin_code}</td>
								<td>${tempBidder.bpassword}</td>

							</tr>

						</c:forEach>

					</table>
				
</body>
</html>