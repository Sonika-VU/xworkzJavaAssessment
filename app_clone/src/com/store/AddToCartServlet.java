package com.store;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.*;

@WebServlet("/AddToCartServlet")
public class AddToCartServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String productIdStr = request.getParameter("productId");
        if (productIdStr == null) {
            response.sendRedirect("viewProducts.jsp");
            return;
        }

        int productId = Integer.parseInt(productIdStr);

        HttpSession session = request.getSession();
        List<Integer> cart = (List<Integer>) session.getAttribute("cart");

        if (cart == null) {
            cart = new ArrayList<>();
        }

        cart.add(productId);
        session.setAttribute("cart", cart);

        response.sendRedirect("viewProducts.jsp");
    }
}
