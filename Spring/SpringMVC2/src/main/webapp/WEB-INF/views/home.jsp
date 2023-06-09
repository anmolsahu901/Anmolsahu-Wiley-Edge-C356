<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>
	<h1>Welocome to home page </h1>
	<h2>called by home controller</h2>
	
	<%
	String name = (String)request.getAttribute("name");
	List<String> list =(List<String>) request.getAttribute("f");
	%>
	<h1>My name is  <%=name %></h1>
	
	
	
</body>
</html>