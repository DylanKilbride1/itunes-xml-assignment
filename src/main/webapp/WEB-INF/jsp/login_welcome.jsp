<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html lang="en">
<head>

  <!-- Access the bootstrap Css like this,
      Spring boot will handle the resource mapping automcatically -->
  <link rel="stylesheet" type="text/css" href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />

  <!--
	<spring:url value="/css/main.css" var="springCss" />
	<link href="${springCss}" rel="stylesheet" />
	 -->

</head>
<body>

<h1>Login</h1>
<form action="login_user" method="post">
  <table style="with: 50%">
    <tr>
      <td>Email</td>
      <td><input type="text" name="email" /></td>
    </tr>
    <tr>
      <td>Password</td>
      <td><input type="password" name="password" /></td>
    </tr>
  </table>
  <input type="submit" value="Submit" />
</form>

</body>
</html>