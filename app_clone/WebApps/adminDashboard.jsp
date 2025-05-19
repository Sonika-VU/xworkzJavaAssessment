<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="javax.servlet.http.*, javax.servlet.*" %>
<%@ page session="true" %>
<!DOCTYPE html>
<html>
<head>
    <title>Admin Dashboard</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: linear-gradient(120deg, #89f7fe, #66a6ff);
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .dashboard-container {
            background-color: white;
            padding: 40px;
            border-radius: 12px;
            box-shadow: 0 8px 25px rgba(0, 0, 0, 0.2);
            width: 90%;
            max-width: 500px;
            text-align: center;
        }

        h2 {
            color: #333;
            margin-bottom: 20px;
        }

        .welcome-msg {
            font-size: 18px;
            color: #444;
            margin-bottom: 30px;
        }

        ul {
            list-style: none;
            padding: 0;
        }

        li {
            margin: 15px 0;
        }

        a.button-link {
            text-decoration: none;
            background-color: #4CAF50;
            color: white;
            padding: 12px 25px;
            border-radius: 6px;
            font-size: 16px;
            display: inline-block;
            transition: background 0.3s ease;
        }

        a.button-link:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>

    <div class="dashboard-container">
        <%
            String username = (String) session.getAttribute("username");
            if (username == null) {
                response.sendRedirect("login.jsp");
                return;
            }
        %>
        <h2>Admin Dashboard</h2>
        <div class="welcome-msg">Welcome, <strong><%= username %></strong>!</div>

        <ul>
            <li><a href="addProduct.jsp" class="button-link">Add Product</a></li>
            <li><a href="ViewProductsServlet" class="button-link">View Products</a></li>
        </ul>
    </div>

</body>
</html>
