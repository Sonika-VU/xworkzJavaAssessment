<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add New Product</title>
</head>
<body>
    <h2>Add New Product</h2>
    <form action="AddProductServlet" method="post">
        <label>Product Name:</label><br>
        <input type="text" name="name" required><br><br>

        <label>Product Price:</label><br>
        <input type="number" step="0.01" name="price" required><br><br>

        <label>Image File Name (e.g., milk.jpg):</label><br>
        <input type="text" name="image" required><br><br>

        <input type="submit" value="Add Product">
    </form>
    <br>
    <a href="index.jsp">Back to Home</a>
</body>
</html>
