<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ page isELIgnored = "false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>

<h4 class="text-center mt-3 text-dark">List of Users</h4>

<div class="table-responsive">
<table class="table mt-4 table-bordered border border-2 border-danger">
<thead>
<tr>
<th class="text-danger">Id</th>
<th class="text-danger">First Name</th>
<th class="text-danger">Last Name</th>
<th class="text-danger">Email</th>
<th class="text-danger">Phone Number</th>
<th class="text-danger">Action</th>

</tr>
</thead>

<tbody>
<c:forEach var="getAllUsers" items="${users}">
<tr class="table-secondary">
<td>${getAllUsers.getId() }</td>
<td>${getAllUsers.getFirstName()}</td>
<td>${getAllUsers.getLastName()}</td>
<td>${getAllUsers.getEmail()}</td>
<td>${getAllUsers.getPhoneNumber()}</td>
<td><a href="delete/${getAllUsers.id }">Delete</a> &nbsp
 <a href="fetchUser?userId=${getAllUsers.id }">Edit</a> </td>

</tr>
</c:forEach>
</tbody>
</table>
<div class="d-flex justify-content-center mb-3">
<a class="btn btn-danger" href="index.jsp" role="button">Back</a>
</div>
</div>
</body>
</html>

