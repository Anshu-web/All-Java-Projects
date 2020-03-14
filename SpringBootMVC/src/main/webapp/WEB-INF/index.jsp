
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Submission Form</title>
</head>
<body>
<form:errors path="msg.*"/>
	<form:form action="/commentSubmission" method="post">

		<table>

			<tr>
				<td>Name</td>
				<td><input type="text" name="name" placeholder="Enter Name"></td>
			</tr>

			<tr>
				<td>Comment</td>
				<td><input type="text" name="comment" placeholder="Enter Comment"></td>
			</tr>

			<tr>
				<td></td>
				<td><input type="submit" name="Submit"></td>
			</tr>


		</table>

	</form:form>
	
</body>
</html>