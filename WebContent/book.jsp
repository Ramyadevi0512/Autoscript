<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to Online Bookstore</title>
</head>
<body>
<center>
	<h1>Welcome to Online Bookstore</h1><br><br><br><br><br>
	<form action="booksrv">
		Customer Name: <input type=text name="uname"><br><br><br>
		Select Books: <select name="book">
			<option value="java">JAVA</option>
			<option value="selenium">SELENIUM</option>
			<option value="oracle">ORACLE</option>
			<option value="obiee">OBIEE</option>
		</select>
		<br><br><br><br><br>
		<input type="submit" value="SUBMIT"/>
	</form>
</center>
</body>
</html>