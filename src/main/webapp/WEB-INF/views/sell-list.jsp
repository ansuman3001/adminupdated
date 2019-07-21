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



				<h3 align=center>Crops for Bididing</h3>
				<hr color="black" size="3" />
				<table border=1   align=center>
						<tr>
						   <th>Registration id</th>
							<th>Crop Type</th>
							<th>Crop Name</th>
							<th>Fertilizer Type</th>
							<th>Quantity</th>
							
						</tr>

						<!-- loop over and print our customers -->
						<c:forEach var="tempSell" items="${sellrequests}">
						
						

							<tr bgcolor="grey">
								<td>${tempSell.req_id}</td>
								<td>${tempSell.crop_type}</td>
								<td>${tempSell.crop_name}</td>
								<td>${tempSell.fertilizer_type}</td>
								<td>$tempSell.Quantity}</td>
							
								<td>
							
							</tr>

						</c:forEach>
						
						

					</table>
				
</body>
</html>