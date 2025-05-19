package com.store;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.*;
import java.util.*;

public class CartServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        List<Integer> cartIds = (List<Integer>) session.getAttribute("cart");  // Fix casting
        List<Product> cart = new ArrayList<>();

        double total = 0;

        if (cartIds != null && !cartIds.isEmpty()) {
            try (Connection con = DBUtil.getConnection()) {
                for (int id : cartIds) {
                    PreparedStatement ps = con.prepareStatement("SELECT * FROM products WHERE id = ?");
                    ps.setInt(1, id);
                    ResultSet rs = ps.executeQuery();

                    if (rs.next()) {
                        Product p = new Product();
                        p.setId(rs.getInt("id"));
                        p.setName(rs.getString("name"));
                        p.setPrice(rs.getDouble("price"));
                        p.setImage(rs.getString("image"));
                        cart.add(p);
                        total += p.getPrice();
                    }

                    rs.close();
                    ps.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        request.setAttribute("cart", cart);
        request.setAttribute("total", total);

        RequestDispatcher rd = request.getRequestDispatcher("cart.jsp");
        rd.forward(request, response);
    }
}
