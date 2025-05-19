<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*, com.store.Product" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Your Shopping Cart</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 40px;
            background-color: #f9f9f9;
        }

        h2 {
            color: #333;
        }

        table {
            width: 60%;
            border-collapse: collapse;
            margin-bottom: 20px;
            background-color: #fff;
        }

        th, td {
            padding: 12px;
            border: 1px solid #ccc;
            text-align: left;
        }

        th {
            background-color: #eee;
        }

        .actions {
            margin-top: 20px;
        }

        .actions a {
            padding: 10px 20px;
            background-color: #28a745;
            color: white;
            text-decoration: none;
            border-radius: 5px;
        }

        .actions a:hover {
            background-color: #218838;
        }
    </style>
</head>
<body>

    <h2>Your Shopping Cart</h2>

    <table>
        <tr>
            <th>Product</th>
            <th>Price</th>
        </tr>
        <%
            List<Product> cart = (List<Product>) request.getAttribute("cart");
            double total = (double) request.getAttribute("total");

            if (cart != null && !cart.isEmpty()) {
                for (Product p : cart) {
        %>
        <tr>
            <td><%= p.getName() %></td>
            <td>₹ <%= p.getPrice() %></td>
        </tr>
        <%
                }
            } else {
        %>
        <tr><td colspan="2">Your cart is empty.</td></tr>
        <%
            }
        %>
        <tr>
            <td><strong>Total</strong></td>
            <td><strong>₹ <%= total %></strong></td>
        </tr>
    </table>

    <div class="actions">
        <a href="viewProducts.jsp">Add More Products</a>
    </div>

</body>
</html>
