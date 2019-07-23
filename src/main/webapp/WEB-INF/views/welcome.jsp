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
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark static-top">
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
   
      
      <li class="nav-item">
       <a class="nav-link"  style="right" href="<c:url value="../user/loginForm"/>">Logout</a>
    
      </li>
    </ul>
  </div>
</nav>
   <br><br><br>
   
   <center>
    <div class="row"></div>
        <div class="col-4">
          <div class="list-group" id="list-tab" role="tablist">
            <a class="button btn btn-primary"  href="<c:url value="/sellReq/showSellReqDetails"/>">Sell Request</a> 
           
         
        </div>
        
        </div>
        </center>
      </div>
      </center>