<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="<c:url value="/resources/css/style1.css" />" rel="stylesheet">
</head>
<body>

<h3>Bid Data</h3>

<div class="container">
  <form:form action="savePlaceSellRequest" method="post" modelAttribute="placeSellReq">
  
  
<!--     <label for="Crop Type">Crop type</label></br> -->
    <form:input path="bidder_name" placeholder="Bidder Name" /><br>
    
<!--     <label for="Fertilizer Type">Fertilizer Type</label></br> -->
    <form:input path="bidder_city" placeholder="Bidder City" /><br>
    

<!--      <label for="Crop Name">Crop name</label></br> -->
    <form:input path="bidder_phone" placeholder="Crop name" /><br>
    
<!--     <label for="Quantity">Quantity</label></br> -->
    <form:input path="current_bid" placeholder="Quantity" /><br>
    
    
<!--     <label for="Minimum Bid amount">Minimum Bid Amount</label></br> -->
    <form:input path="bid_amount" placeholder="Amount" /><br>
   

    <form:button>Submit</form:button>
  </form:form>
</div>

</body>
</html>