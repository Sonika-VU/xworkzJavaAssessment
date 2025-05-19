<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.List" %>
<%@ page import="com.store.DBUtil" %>
<!DOCTYPE html>
<html>
<head>
    <title>Shop - Product List</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
            background: #f4f4f4;
        }
        h2 {
            text-align: center;
            margin-bottom: 30px;
        }
        .top-bar {
            text-align: right;
            margin-bottom: 20px;
        }
        .top-bar a {
            text-decoration: none;
            background: #007bff;
            color: white;
            padding: 10px 15px;
            border-radius: 4px;
        }
        .top-bar a:hover {
            background: #0056b3;
        }
        .product-grid {
            display: flex;
            flex-wrap: wrap;
            justify-content: center;
            gap: 20px;
        }
        .product-card {
            background: white;
            border-radius: 8px;
            box-shadow: 0 2px 5px rgba(0,0,0,0.1);
            width: 200px;
            padding: 15px;
            text-align: center;
        }
        .product-card img {
            width: 150px;
            height: 150px;
            object-fit: contain;
            margin-bottom: 15px;
        }
        .product-card h3 {
            margin: 10px 0 5px 0;
            font-size: 18px;
        }
        .product-card p {
            font-size: 16px;
            color: #333;
            margin-bottom: 15px;
        }
        .product-card form input[type="submit"] {
            background: #28a745;
            color: white;
            border: none;
            padding: 10px 15px;
            font-size: 14px;
            border-radius: 4px;
            cursor: pointer;
        }
        .product-card form input[type="submit"]:hover {
            background: #218838;
        }
    </style>
</head>
<body>
    <h2>Products</h2>

    <%
        List<com.store.Product> cart = (List<com.store.Product>) session.getAttribute("cart");
        int cartCount = (cart != null) ? cart.size() : 0;
    %>
    <div class="top-bar">
        <a href="CartServlet">🛒 View Cart (<%= cartCount %>)</a>
    </div>

    <div class="product-grid">
    <%
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            con = DBUtil.getConnection();
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM products");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double price = rs.getDouble("price");
                String imageName = rs.getString("image");
    %>
        <div class="product-card">
            <img src="images/<%= imageName %>" alt="<%= name %>">
            <h3><%= name %></h3>
            <p>₹ <%= price %></p>
            <form action="AddToCartServlet" method="post">
                <input type="hidden" name="productId" value="<%= id %>">
                <input type="submit" value="Add to Cart">
            </form>
        </div>
    <%
            }
        } catch (Exception e) {
            out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
        } finally {
            if (rs != null) try { rs.close(); } catch (Exception e) {}
            if (stmt != null) try { stmt.close(); } catch (Exception e) {}
            if (con != null) try { con.close(); } catch (Exception e) {}
        }
    %>
    </div>

</body>
</html>