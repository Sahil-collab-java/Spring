<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <title>Hello, world!</title>
  <meta name="viewport" content="width=device-width,initial-scale=1" />
  <meta name="description" content="" />
  <link rel="icon" href="favicon.png">
</head>
<body>
    <label style="font-weight: bold; font-size: 40px;">Product:</label>
    <br>
    <label style="font-weight: bold; font-size: 20px; color: green;">${msg}</label>

    <br>
    <form:form action="saveProduct" modelAttribute="p" method="POST">
        <label for="name">Name:</label>
        <form:input path="name" />
        <br/>
    
        <label for="price">Price:</label>
        <form:input path="price" />
        <br/>
    
        <label for="qty">Quantity:</label>
        <form:input path="qty" />
        <br/>
    
        <button type="submit">Save</button>
    </form:form>

    <label style="font-weight: bold; font-size: 40px;">Table:</label>
    <label >${getAllData}</label>

    <table border="1">
        <thead>
            <tr>
                <th>Name</th>
                <th>Price</th>
                <th>Quantity</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${getAllData}" var="product">
                <tr>
                    <td>${product.name}</td>
                    <td>${product.price}</td>
                    <td>${product.qty}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    
    
    
    
</body>
</html>