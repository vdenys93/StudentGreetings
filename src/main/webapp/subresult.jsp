<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Results</title>
</head>
<body>
<p>
${userNumbers.getFirstNum()} - ${userNumbers.getSecondNum()} = ${userNumbers.getSub()} 
</p>
<a href="index.jsp">Add again?</a>
<a href="subtract.jsp"> Click here if you want to subtract some numbers?</a>
</body>
</html>