<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="mytags" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<mytags:navbar />

	<div align="center">

		<table border="1">
			<tr>
				<th>ID</th>
				<th>name</th>
				<th>client name</th>
				<th>project manager id</th>
			<tr>
				<c:forEach items="${listProjects}" var="projects">
					<tr>
						<td>${projects.id}</td>
						<td>${projects.name}</td>
						<td>${projects.clientName}</td>
						<td>${projects.pmID}</td>


					</tr>
				</c:forEach>
		</table>
	</div>


</body>
</html>