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



				<h3 align=center>Farmer List</h3>
				<hr color="black" size="3" />
				<table border=1   align=center>
						<tr>
						<th>Farmer ID</th>
							<th>Farmer Name</th>
							<th>Contact</th>
							<th>Email ID</th>
							<th>House Number</th>
							<th>City</th>
							<th>State</th>
							<th>Country</th>
							<th>Pin-code</th>
							
						</tr>

						<!-- loop over and print our customers -->
						<c:forEach var="tempFarmer" items="${farmers}">

							<tr bgcolor="grey">
								<td>${tempFarmer.farmer_id}</td>
								<td>${tempFarmer.fullname}</td>
								<td>${tempFarmer. contact}</td>
								<td>${tempFarmer.email_id }</td>
								<td>${tempFarmer.house_no}</td>
								<td>${tempFarmer.city}</td>
								<td>${tempFarmer.state}</td>
								<td>${tempFarmer.country}</td>
								<td>${tempFarmer.pin_code}</td>
								<td>${tempFarmer.password}</td>

							</tr>

						</c:forEach>

					</table>
				
</body>
</html>