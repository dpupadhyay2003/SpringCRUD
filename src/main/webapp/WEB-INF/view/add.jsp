<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
	<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ADD</title>
</head>
<body>
	<form:form action="/insertData" method="POST" modelAttribute="NameVo">
	<form:input type="hidden" path="id" value="${DataById.id }" />
		<table>
			<tr>
				<td>First Name :</td>
				<td>Last Name :</td>
			</tr>
			<tr>
				<td><form:input type="text" path="firstname" value="${DataById.firstname }" /></td>
				<td><form:input type="text" path="lastname" value="${DataById.firstname }" /></td>
			</tr>
		</table>
		<br /> 

<c:choose>
		<c:when test="${DataById.id }">
			<input type="Submit" name="Update" />				
		</c:when>
		<c:otherwise>
			<input type="Submit" name="Submit" />
		</c:otherwise>
</c:choose>
			
	</form:form>

</body>
</html>