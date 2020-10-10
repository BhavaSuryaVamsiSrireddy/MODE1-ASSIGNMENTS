<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HOME</title>
<link href="css/Home.css" type="text/css" rel="stylesheet" />
<script src="js/Home.js"></script>
</head>
<body>
	<h1>LOGIN APPLICATION</h1>
	<!-- For login the request will goes to login servlet -->
	<form name="loginform" method="post" action="./LoginServlet"
		onsubmit="return validate()">
		<div class="formdivision">
			<table>
				<tr>
					<td><p>ENTER USERNAME</p></td>
					<td><input type="text" name="userName" required="required"></td>
				</tr>
				<tr>
					<td><p>ENTER PASSWORD</p></td>
					<td><input type="password" name="password" required="required"></td>
				</tr>
				<tr>
					<td><input type="submit" value="LOGIN"></td>
					<td><a href="./com.view/Registration.jsp">SIGN UP</a></td>
				</tr>
			</table>
		</div>
	</form>

</body>
</html>





