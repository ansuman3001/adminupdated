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
						    <th>Auction Id</th>
							<th>Bidder Name</th>
							<th>Bidder City</th>
							<th>Bidder Phone</th>
							<th>Current Bid</th>
							<th>Bid Amount</th>
							<th>Status</th>
							
							
							
						</tr>

						<!-- loop over and print our customers -->
						<c:forEach var="tempAuction" items="${auctions}">
						
						

							<tr bgcolor="grey">
							
								<td>${tempAuction.auction_id}</td>
								<td>${tempAuction.biddername}</td>
								<td>${tempAuction.biddercity}</td>
								<td>${tempAuction.bidderphone}</td>
								<td>${tempAuction.currentbid}</td>
								<td>${tempAuction.bidamount}</td>
								
								
								
								<td>
							
							</tr>

						</c:forEach>
						
						

					</table>
				
</body>
</html>