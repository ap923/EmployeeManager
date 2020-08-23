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
				<th>First name</th>
				<th>Last name</th>
				<th>JMBG</th>
				<th>Position</th>
				<th>Team Number</th>
			<tr>
				<c:forEach items="${listEmployee}" var="employee">
					<tr>
						<td>${employee.id}</td>
						<td>${employee.fname}</td>
						<td>${employee.lname}</td>
						<td>${employee.jmbg}</td>
						<td>${employee.position}</td>
						<td>${employee.tid}</td>

					</tr>
				</c:forEach>
		</table>
		<br>
		
	</div>
	
	

	
</body>
</html>