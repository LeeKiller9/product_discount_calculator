<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Product Discount Calculator</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
<h1><%= "Product Discount Calculator" %>
</h1>
<form action="/Servlet_discount_calculator" method="post">
    <label for="description">Description</label>
    <input id="description" type="text" name="description" size="50">
    <label for="listPrice">List Price</label>
    <input id="listPrice" type="number" name="listPrice" pattern="[0-9]">
    <label for="discountPercent">Discount Percent</label>
    <input id="discountPercent" type="number" name="discountPercent" pattern="[0-9]"><br>
    <button type="submit">Calculator</button>
</form>
</body>
</html>