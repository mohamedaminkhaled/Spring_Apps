<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<!DOCTYPE html>
<html>
	<head>
		<%@ include file="includes/header.jspf" %>
	</head>
	<body>
		<%@ include file="includes/navbar.jspf" %>
		
		<form action="/spring_mvc_test/add" method="POST">
		  <div class="alert alert-danger">
		  	<p style="color:red">${errMsg}</p>
		  </div>
		  <div class="mb-3 mt-3">
		    <label for="email" class="form-label">Name:</label>
		    <input type="text" class="form-control" placeholder="Enter name" name="name" required>
		  </div>
		  <div class="mb-3">
		    <label for="date" class="form-label">Date:</label>
		    <input type="text" class="form-control" id="date" placeholder="Enter date" name="date" required>
		  </div>
		  <div class="form-check mb-3">
		    <label class="form-check-label">
		      <input class="form-check-input" type="checkbox" name="remember"> Remember me
		    </label>
		  </div>
		  <button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</body>
</html>