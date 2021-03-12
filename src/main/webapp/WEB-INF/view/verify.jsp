<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>OTP Verify</title>
</head>
<body>

<input type="text" name="verfyingNumber">


<form:form action="/verifyNumber" method="POST">

	<form:input type="text" path="verfyingNumber" value="" />
	
	<input type="Submit" name="Submit OTP" />	

</form:form>

</body>
</html>