<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="mytags" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<mytags:navbar/>

	<div align="center">
	
			<table border="1">
			<tr>
				<th>ID</th>
				<th>name</th>
				<th>leaderID</th>
				
			<tr>
				<c:forEach items="${listTeams}" var="teams">
					<tr>
						<td>${teams.id}</td>
						<td>${teams.name}</td>
						<td>${teams.leaderID}</td>

					</tr>
				</c:forEach>
		</table>
	</div>


</body>
</html>