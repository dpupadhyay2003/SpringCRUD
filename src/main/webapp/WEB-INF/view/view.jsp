<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>VIEW</title>
</head>
<body>
	<h2>
		<a href="/loadAdd"> ADD </a>
	
		
		
		<a href="/otpVerify"> OTP Verify </a>
	
	
	
	
	</h2>
	<table border="1">
		<tr>
			<th>First Name :</th>
			<th>Last Name :</th>
			<th>Action</th>
		</tr>
		
		<c:forEach var="i" items="${allData}">
			<tr>
				<td> ${i.firstname} </td>
				<td> ${i.lastname} </td>
				<td><b> <a href="/editDataById?id=${i.id }"> Edit </a> / 
						<a href="/deleteDataById?id=${i.id }" > Delete </a>
				</b></td>
			</tr>		
		</c:forEach>
	</table>

</body>
</html>