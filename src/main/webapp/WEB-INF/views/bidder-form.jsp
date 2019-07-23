<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
 <header>
 <meta charset="UTF-8">
  
 <title>Farmer Login</title>
<link href="<c:url value="/resources/css/FarmerLoginCss.css" />" rel="stylesheet">
 </header>
  <body>
 <h1 style="text-align:center">Bidder Form</h1>
<div class="login-page">
  <div class="form">
  
 <form:form action="login1User" method="post" modelAttribute="user1">
      <form:input path="bemail_id" type="text" placeholder="Email"/>
      <form:input path="bpassword" type="password" placeholder="Password"/>
     <a class="button btn btn-primary"  href="<c:url value="../sellReq/listSellreq"/>">Login</a>       
      <p class="message">Not registered? <a href="../bidder/showRegBidder">Register As Bidder</a></p>
      </form:form>
  </div>
</div>
</body>