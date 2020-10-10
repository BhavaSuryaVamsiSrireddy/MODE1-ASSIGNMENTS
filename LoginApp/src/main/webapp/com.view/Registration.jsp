<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>REGISTRATION</title>
<link href="../css/Registration.css" type="text/css" rel="stylesheet" />
<script src="../js/Registration.js"></script>
</head>
<body>
<h1 id="heading">REGISTRATION FORM</h1>
<form name="regform" action="../RegistrationServlet" method="post" onsubmit="return validate()">
		<div class="formdivision">
			<table>
				<tr>
					<td><p>ENTER YOUR FIRST NAME</p></td>
					<td><input type="text" name="firstName" required="required"></td>
				</tr>
				<tr>
					<td><p>ENTER YOUR LAST NAME</p></td>
					<td><input type="text" name="lastName" required="required"></td>
				</tr>
				<tr>
					<td><p>ENTER USER NAME(email Id)</p></td>
					<td><input type="email" name="userName" required="required"></td>
				</tr>
				<tr>
					<td><p>ENTER PASSWORD</p></td>
					<td><input type="password" name="password" required="required"></td>
				</tr>
				<tr>
					<td><p>ENTER YOUR AGE</p></td>
					<td><input type="number" name="age" required="required"></td>
				</tr>
				<tr>
					<td><p>SELECT THE GENDER</p></td>
					<td rowspan="2"><input type="radio" name="gender" value="male">
						<label for="male">Male</label> <input type="radio" name="gender"
						value="female"> <label for="female">Female</label><br />
						<br /></td>
				</tr>
				<tr>
					<td><input type="submit" value="REGISTER"></td>
				</tr>
			</table>
		</div>

	</form>
</body>
</html>