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

  <form:form action="saveAuction" method="post" modelAttribute="auction">
 
    		<form:hidden path="auction_id" />
       Bidder Name<form:input path="biddername" placeholder="Bidder Name" /><br>
      Bidder City <form:input path="biddercity" placeholder="Bidder City" /><br>
      Phone <form:input path="bidderphone" placeholder="Bidder Phone" /><br>
      Current Bid <form:input path="currentbid" value="${bamt}" placeholder="Current Bid" /><br>
       Bid Amount<form:input path="bidamount" placeholder="Bid Amount" /><br>

    <form:button>Submit</form:button>
  </form:form>
</div>

</body>
</html>