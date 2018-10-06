<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
 <link rel="stylesheet" type="text/css" href="style.css">
 <script type="text/javascript" src="app.js"></script>
 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Date</title>
</head>
<body>
	<div class="home">
		<h1 class="date"><c:out value="${date}"></c:out></h1>
	</div>
</body>
</html>