<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ page isELIgnored = "false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
</head>
<body>

<div>
<form action="updateUser" method="post">

<input type="text" hidden name="id" value="${user.getId()}"> <br>

First Name <input type="text" name="firstName" value="${user.getFirstName()}"> <br>

Last Name <input type="text" name="lastName" value="${user.getLastName()}"> <br>

Email <input type="email" name="email"/ value="${user.getEmail()}"> <br>

Phone Number <input type="numbers" name="phoneNumber" value="${user.getPhoneNumber()}"> <br>

<input type="submit" value="update"/>

</form>
</div>
</body>
</html>
