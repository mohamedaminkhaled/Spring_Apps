<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<%@ include file="includes/header.jspf" %>
	</head>
	<body>
		<%@ include file="includes/navbar.jspf" %>
		
		<h1>Welcome ${name}</h1>
		
		<table class="table">
		  <thead class="thead-dark">
		    <tr>
		      <th scope="col">ID</th>
		      <th scope="col">name</th>
		      <th scope="col">date</th>
		      <th scope="col">is active</th>
		      <th scope="col">Delete</th>
		      <th scope="col">Edit</th>
		    </tr>
		  </thead>
		  <tbody>
		  <c:forEach items="${students}" var="stdnt">
		    <tr>
		      <th scope="row">${stdnt.id}</th>
		      <td>${stdnt.name}</td>
		      <td>${stdnt.date}</td>
		      <td>${stdnt.isActive}</td>
		      <td><a href="/spring_mvc_test/delete?id=${stdnt.id}" class="btn btn-danger">Delete</a></td>
		      <td><a href="/spring_mvc_test/edit?id=${stdnt.id}" class="btn btn-success">Edit</a></td>
		    </tr>
		  </c:forEach>
		  </tbody>
		</table>

		<a class="btn btn-primary" href="/spring_mvc_test/add" role="button">Add student</a>
	</body>
</html>