<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">  
  				<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>  
  				<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.6/umd/popper.min.js"></script>  
  				<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script> 
  				
<style>

.center  {
  margin: 0;
  position: absolute;
  top: 50%;
  left: 50%;
  -ms-transform: translate(-50%, -50%);
  transform: translate(-50%, -50%);
}

</style> 				
  				
<body style="background-color:powderblue;">
<div class="center">
<h1 style="text-align:center, font-family:verdana;">ADMINISTRATOR HANDLE</h1>

<div class="text-center">

<a  class="btn btn-primary btn-lg active" role="button" aria-pressed="true" href="<c:url value="../adminbid/showAdminBidder"/>">Bidder Data</a>

<br><br>

  <a  class="btn btn-primary btn-lg active" role="button" aria-pressed="true" href="<c:url value="../admin/showAdminFarmer"/>">Farmer Data</a>
  
  <br><br><br>
  
  <a  class="btn btn-primary btn-lg active" role="button" aria-pressed="true" href="<c:url value="../admin/showAuction"/>">Auction data</a>
  
  <br><br><br>
</div>
</div>
</body>