<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="/view" method="post">

		<table border="1" align="center">

			<tr>
				<td>Name</td>
				<td><input type="text" name="name"></td>
			</tr>

			<tr>
				<td>Email</td>
				<td><input type="text" name="email"></td>
			</tr>
			
			<tr>
				<td>DOB</td>
				<td><input type="text" name="dob"></td>
			</tr>
			
			<tr>
			<td>Technical Skills</td>
			<td><select name="skills" multiple>
			<option value="spring">spring</option>
			<option value="Hibernate">Hibernate</option>
			<option value="ORM">ORM</option>
			<option value="J2EE">J2EE</option>
			
			</select>
			
			</td>
			
			</tr>

			<tr>
				<td></td>
				<td><input type="submit" name="Submit"></td>
			</tr>


		</table>

	</form>
	

</body>
</html>