    <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">  
  				<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>  
  				<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.6/umd/popper.min.js"></script>  
  				<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script>
                 
<style>
* {box-sizing: border-box}
body {font-family: Verdana, sans-serif; margin:0}
.mySlides {display: none}
img {vertical-align: middle;}

/* Slideshow container */
.slideshow-container {
  max-width: 10	0%;
  position: relative;
  margin: auto;
}

body{
	margin:auto;
}

h4{
	padding:20px;
}

#example2 {
  background:#9fdfbc ;
  padding: 20px;
  width: 100%;
  height: 500px;
}

/* Next & previous buttons */
.prev, .next {
  cursor: pointer;
  position: absolute;
  top: 50%;
  width: auto;
  padding: 16px;
  margin-top: -22px;
  color: white;
  font-weight: bold;
  font-size: 18px;
  transition: 0.6s ease;
  border-radius: 0 3px 3px 0;
  user-select: none;
}

/* Position the "next button" to the right */
.next {
  right: 0;
  border-radius: 3px 0 0 3px;
}

/* On hover, add a black background color with a little bit see-through */
.prev:hover, .next:hover {
  background-color: rgba(0,0,0,0.8);
}

/* Caption text */
.text {
  color: #f2f2f2;
  font-size: 15px;
  padding: 8px 12px;
  position: absolute;
  bottom: 8px;
  width: 100%;
  text-align: center;
}

/* Number text (1/3 etc) */
.numbertext {
  color: #f2f2f2;
  font-size: 12px;
  padding: 8px 12px;
  position: absolute;
  top: 0;
}

/* The dots/bullets/indicators */

.active, .dot:hover {
  background-color: #717171;
}

/* Fading animation */
.fade {
  -webkit-animation-name: fade;
  -webkit-animation-duration: 1.5s;
  animation-name: fade;
  animation-duration: 1.5s;
}

@-webkit-keyframes fade {
  from {opacity: .4} 
  to {opacity: 1}
}

@keyframes fade {
  from {opacity: .4} 
  to {opacity: 1}
}

/* On smaller screens, decrease text size */
@media only screen and (max-width: 300px) {
  .prev, .next,.text {font-size: 11px}
}
</style>
</head>
<body>
          <nav class="navbar navbar-expand-lg navbar-dark bg-dark static-top">
              <div class="container">
				<a class="navbar-brand" href="#">
                      <img  alt="" height="60" width="60"  src= "<c:url value="/resources/images/agrilogo.png"/>">
                    </a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                      <span class="navbar-toggler-icon"></span>
                    </button>
                <div class="collapse navbar-collapse" id="navbarResponsive">
                  <ul class="navbar-nav ml-auto">
                      
                          </a>
                         
                    </li>
                    <li class="nav-item">
                      <a class="nav-link" href="<c:url  value="/farmer/aboutus" />">About</a>
                    </li>
                    <div class="dropdown">
                        <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                          Login
                        </button>
                        <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                          <a class="dropdown-item" href="<c:url  value="user/loginForm" />">Farmer</a>
                          <a class="dropdown-item" href="<c:url  value="user1/login1Form" />">Bidder</a>
                          <a class="dropdown-item" href="<c:url value="/admin/showAdmin"/>">Administrator</a>
                        </div>
                      </div>
                    <li class="nav-item">
                      <a class="nav-link" href="<c:url value="/farmer/contactus"/>">Contact</a>
                    </li>
                  </ul>
                </div>
              </div>
            </nav>
            <div class="container">
                <center><h2 class="mt-4" style="padding:10px;">Welcome to e-Farm!!</h2></center>
              </div>

<div class="slideshow-container">

<div class="mySlides fade">
  <div class="numbertext">1 / 5</div>
  <img src= "<c:url value="/resources/images/a.jpg"/>" style="width:100%">
  
</div>

<div class="mySlides fade">
  <div class="numbertext">2 / 5</div>
  <img src= "<c:url value="/resources/images/b.jpg"/>"style="width:100%">
  
</div>

<div class="mySlides fade">
  <div class="numbertext">3 / 5</div>
  <img src= "<c:url value="/resources/images/c.jpg"/>" style="width:100%">
  
</div>

<div class="mySlides fade">
  <div class="numbertext">4 / 5</div>
  <img src= "<c:url value="/resources/images/d.jpg"/>" style="width:100%">
  
</div>

<div class="mySlides fade">
  <div class="numbertext">5 / 5</div>
   <img src= "<c:url value="/resources/images/e.jpg"/>" style="width:100%">
  
</div>

</div>


<br>

<div style="text-align:center">
  <span class="dot"></span> 
  <span class="dot"></span> 
  <span class="dot"></span> 
  <span class="dot"></span> 
  <span class="dot"></span> 
</div>

<script>
var slideIndex = 0;
showSlides();

function showSlides() {
  var i;
  var slides = document.getElementsByClassName("mySlides");
  var dots = document.getElementsByClassName("dot");
  for (i = 0; i < slides.length; i++) {
    slides[i].style.display = "none";  
  }
  slideIndex++;
  if (slideIndex > slides.length) {slideIndex = 1}    
  for (i = 0; i < dots.length; i++) {
    dots[i].className = dots[i].className.replace(" active", "");
  }
  slides[slideIndex-1].style.display = "block";  
  dots[slideIndex-1].className += " active";
  setTimeout(showSlides, 1600); // Change image every 1.6 seconds
}
</script>

   

</body>
</html> 




              