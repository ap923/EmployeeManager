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
<br>
	<div align="center">
	
			<table border="1">
			<tr>
				<th>Project ID</th>
				<th>Employee ID</th>
				<th>hours</th>
				<th>date</th>
				
			<tr>
				<c:forEach items="${listHours}" var="hours">
					<tr>
						<td>${hours.pid}</td>
						<td>${hours.eid}</td>
						<td>${hours.hours}</td>
						<td>${hours.date}</td>

					</tr>
				</c:forEach>
		</table>
		<br>
		<p>How many hours did employee work on a project</p>
		<form action="hours">  
		    Project id : <input type="text" name="pid"/> <br><br>   
			Employee id : <input type="text" name="eid"/> <br><br>   
			
			<input type="submit" name="submit">  
		</form>
		
		<p>${hoursWorked}</p>
	</div>
	
	


</body>
</html>