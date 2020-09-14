<%@ page errorPage="ExceptionHandling.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Divide Two Number</title>
</head>
<body>
<%  String num1 = request.getParameter("num1"); 
	String num2 = request.getParameter("num2");

	int res = Integer.parseInt(num1)/Integer.parseInt(num2);	
%>
<%="Result = "+res %>
</body>
</html>