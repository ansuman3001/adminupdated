<html>
<head>
<title>
Login page
</title>
</head>
<body>
<h1 style="font-family:Comic Sans Ms;text-align="center";font-size:20pt;
color:#00FF00; text-align:center;>
Admin Login
</h1>
<form name="login">
Username<input type="text" name="userid"/>
Password<input type="password" name="pswrd"/>
<input type="button" onclick="check(this.form)" value="Login" href="/admin/listFarmer"/>
<input type="reset" value="Cancel"/>
</form>
<script language="javascript">
function check(form)/*function to check userid & password*/
{
 /*the following code checkes whether the entered userid and password are matching*/
 if(form.userid.value == "admin" && form.pswrd.value == "admin")
  {
    window.open('target.html')/*opens the target page while Id & password matches*/
  }
 else
 {
   alert("Error Password or Username")/*displays error message*/
  }
}
</script>
</body>
</html>