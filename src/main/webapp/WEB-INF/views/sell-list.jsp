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



				<h3 align=center>Crops for Bidding</h3>
				<hr color="black" size="3" />
				<table border=1   align=center>
						<tr>
						    <th>Registration id</th>
							<th>Crop Type</th>
							<th>Crop Name</th>
							<th>Fertilizer Type</th>
							<th>Minimum Bid Amount</th>
							<th>Quantity</th>
							<th>Your Bid Amount</th>
							
							
							
						</tr>

						<!-- loop over and print our customers -->
						<c:forEach var="tempSell" items="${sellrequests}">
						
						<c:url var="BidLink" value="/auction/showAuction">
								<c:param name="requestId" value="${tempSell.req_id}" />
							</c:url>

							<tr bgcolor="grey">
							
								<td>${tempSell.req_id}</td>
								<td>${tempSell.crop_type}</td>
								<td>${tempSell.crop_name}</td>
								<td>${tempSell.fertilizer_type}</td>
								<td>${tempSell.min_bid_amount}</td>
								<td>${tempSell.quantity}</td>
								<td>
									 <a href="${BidLink}">Bid</a>
									
								</td>	
									
									
							
								<td>
							
							</tr>

						</c:forEach>
						
						

					</table>
				
</body>
</html>