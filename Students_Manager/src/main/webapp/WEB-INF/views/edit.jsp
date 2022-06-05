<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<!DOCTYPE html>
<html>
	<head>
		<%@ include file="includes/header.jspf" %>
	</head>
	<body>
		<%@ include file="includes/navbar.jspf" %>
		
		<form action="/spring_mvc_test/update" method="POST">
		  <div class="alert alert-danger">
		  	<p style="color:red">${errMsg}</p>
		  </div>
		  <div class="mb-3 mt-3">
		    <input type="hidden" class="form-control" value="${student.id}" name="id">
		  </div>
		  <div class="mb-3 mt-3">
		    <label for="email" class="form-label">Name:</label>
		    <input type="text" class="form-control" value="${student.name}" placeholder="Enter name" name="name">
		  </div>
		  <div class="mb-3">
		    <label for="date" class="form-label">Date:</label>
		    <input type="text" class="form-control" value="${student.date}" id="date" placeholder="Enter date" name="date">
		  </div>
		  <div class="mb-3">
		    <input type="hidden" class="form-control" value="${student.isActive}" name="isActive">
		  </div>
		  <button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</body>
</html>





