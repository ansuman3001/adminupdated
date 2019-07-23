<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<body>

<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<style>
h3{
	padding:30px;
	margin-left:90px;
}

.nav{
	

}

</style>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark static-top">
              <div class="container">
                <a class="navbar-brand" href="#">
                      <img  alt="" height="50" width="50"  src= "<c:url value="/resources/images/agrilogo.png"/>">
                    </a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                      <span class="navbar-toggler-icon"></span>
                    </button>
                <div class="collapse navbar-collapse" id="navbarResponsive">
                  <ul class="navbar-nav ml-auto">
                 
                    </li>
                    <li class="nav-item">
                      <a class="nav-link" href="#">About</a>
                    </li>
		    </ul>
                </div>
              </div>
            </nav>


<h3> Description </h3>

<div class="container">
 
  <div class="card" style="width:300px;position:relative;">
  <img class="card-img-bottom" alt="Card image" style="width:100%"  src= "<c:url value="/resources/images/Almond.jpg"/>">
    <div class="card-body">
      <h4 class="card-title">Almond</h4>
      <p class="card-text">The almond is a species of tree native to Iran and surrounding countries as well as Central Asia,but widely cultivated elsewhere.</p>
      <a href="https://en.wikipedia.org/wiki/Almond" class="btn btn-primary">See Profile</a>
    </div>
  
  
  <div class="card" style="width:300px;position:absolute;left:370px;top:0px;">
  <img class="card-img-bottom" alt="Card image" style="width:100%" src= "<c:url value="/resources/images/Apple.jpg"/>">
    <div class="card-body">
      <h4 class="card-title">Apple</h4>
      <p class="card-text">Apple trees are cultivated worldwide and are the most widely grown species in the genus Malus. The tree originated in Central Asia</p>
      <a href="https://en.wikipedia.org/wiki/Apple" class="btn btn-primary">See Profile</a>
    </div>

  <div class="card" style="width:300px;position:absolute;left:370px;top:0px;">
  <img class="card-img-bottom" alt="Card image" style="width:100%" src= "<c:url value="/resources/images/Barley.jpg"/>">
    <div class="card-body">
      <h4 class="card-title">Barley</h4>
      <p class="card-text">Barley also known as Hordeum vulgare, a member of the grass family is a major cereal grain grown in temperate climates globally.</p>
      <a href="https://en.wikipedia.org/wiki/Barley" class="btn btn-primary">See Profile</a>
    </div>

</div>
</div>
</div>

  <div class="card" style="width:300px;position:relative;">
 <img class="card-img-bottom" alt="Card image" style="width:100%" src= "<c:url value="/resources/images/wheat.jpg"/>">
    <div class="card-body">
      <h4 class="card-title">Wheat</h4>
      <p class="card-text">Wheat is a grass widely cultivated for its seed, a cereal grain which is a worldwide staple food</p>
      <a href="https://en.wikipedia.org/wiki/wheat" class="btn btn-primary">See Profile</a>
    </div>

 <div class="card" style="width:300px;position:absolute;left:370px;top:0px;">
 <img class="card-img-bottom" alt="Card image" style="width:100%" src= "<c:url value="/resources/images/sugarcane.jpg"/>">
    <div class="card-body">
      <h4 class="card-title">Sugarcane</h4>
      <p class="card-text">Sugarcane is a tropical, perennial grass that forms lateral shoots at the base to produce multiple stems</p>
      <a href="https://en.wikipedia.org/wiki/sugarcane>" class="btn btn-primary">See Profile</a>
    </div>

<div class="card" style="width:300px;position:absolute;left:370px;top:0px;">
 <img class="card-img-bottom" alt="Card image" style="width:100%" src= "<c:url value="/resources/images/Saffron.jpg"/>">
    <div class="card-body">
      <h4 class="card-title">Saffron</h4>
      <p class="card-text">Delicate saffron threads, plucked from crocus flowers and dried</p>
      <a href="https://en.wikipedia.org/wiki/saffron" class="btn btn-primary">See Profile</a>
    </div>

</div>
</div>
</div>
</div>

</body>
</html>


</body>