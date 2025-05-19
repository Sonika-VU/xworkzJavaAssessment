<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*,com.store.*,java.sql.*" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Product List</title>
</head>
<body>
<%
    Connection con = DBUtil.getConnection();
    Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery("SELECT * FROM products");
    while (rs.next()) {
%>
    <div style="border:1px solid #ccc; padding:10px; margin:10px;">
        <img src="images/<%=rs.getString("image")%>" width="150" height="150" alt="Product Image" /><br>
        <h3><%=rs.getString("name")%></h3>
        <p>₹<%=rs.getDouble("price")%></p>
    </div>
<%
    }
%>
</body>
</html>
