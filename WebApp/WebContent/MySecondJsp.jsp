<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Request Object</title>
</head>
<body>
<% String method = request.getMethod(); %>
<% String protocol = request.getProtocol(); %>
<% StringBuffer url = request.getRequestURL(); %>
<% response.setContentType("text/html"); %>

<%="Method : "+method %>
<%="Protocol : "+protocol %>
<% out.println("URL : "+url); %>

</body>
</html>