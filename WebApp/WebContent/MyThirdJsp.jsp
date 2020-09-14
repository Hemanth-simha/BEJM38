<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Name and Value</title>
</head>
<body>
<% String res= config.getInitParameter("Class"); %>
<% out.println("Value : "+res); %>
<% String res1= application.getInitParameter("API"); %>
<%="Value : "+res1 %>
</body>
</html>