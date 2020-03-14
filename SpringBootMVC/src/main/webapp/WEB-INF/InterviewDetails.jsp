<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<h1>Submitted Details are as below--</h1>
<body>

	<p>
		<b>Name:</b>${msg.name}</p>
	<p>
		<b>Email:</b>${msg.email}</p>
	<p>
		<b>DOB:</b>${msg.dob}</p>

	<p>
		<b>Skills:</b> ${msg.skills}
	</p>

</body>
</html>