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
						
						<!-- construct an "update" link with customer id -->
							<c:url var="updateLink" value="/bidder/updateForm">
								<c:param name="bidderId" value="${tempBidder.bidder_id}" />
							</c:url>
							<!-- construct an "delete" link with customer id -->
							<c:url var="deleteLink" value="/bidder/delete">
								<c:param name="bidderId" value="${tempBidder.bidder_id}" />
							</c:url>

							<tr bgcolor="grey">
								<td>${tempBidder.bidder_id}</td>
								<td>${tempBidder.bfullname}</td>
								<td>${tempBidder.bcontact}</td>
								<td>${tempBidder.bemail_id }</td>
								<td>${tempBidder.bhouse_no}</td>
								<td>${tempBidder.bcity}</td>
								<td>${tempBidder.bstate}</td>
								<td>${tempBidder.bcountry}</td>
								<td>${tempBidder.bpin_code}</td>
								<td>${tempBidder.bpassword}</td>
								
								<td>
									<!-- display the update link --> <a href="${updateLink}">Update</a>
									| <a href="${deleteLink}"
									onclick="if (!(confirm('Are you sure you want to delete this bidder?'))) return false">Delete</a>
								</td>

							</tr>

						</c:forEach>

					</table>
				
</body>
</html>