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
  
  
 <nav class="navbar navbar-expand-lg navbar-dark bg-dark static-top">
        <div class="container">
          <a class="navbar-brand" href="#">
                <img alt="" height="50" width="50" src= "<c:url value="/resources/images/agrilogo.png"/>">
              </a>
 </nav>

<br><br><br>
  
 <h1 style="text-align:center">Farmer Form</h1>
<div class="login-page">
  <div class="form">
  
  <form:form action="loginUser" method="post" modelAttribute="user">
      <form:input path="email_id" type="text" placeholder="email"/>
      <form:input path="password" type="password" placeholder="password"/>
      <input type="submit" name="submit" id="submit" value="Submit"/>
      <p class="message">Not registered? <a href="../farmer/showRegFarmer">Register As Farmer</a></p>
      </form:form>
  </div>
</div>
</body>
