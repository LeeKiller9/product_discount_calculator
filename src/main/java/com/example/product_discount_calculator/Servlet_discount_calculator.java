package com.example.product_discount_calculator;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet_discount_calculator", value = "/Servlet_discount_calculator")
public class Servlet_discount_calculator extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String description = request.getParameter("description");
        float listPrice = Float.parseFloat(request.getParameter("listPrice"));
        float discountPercent = Float.parseFloat(request.getParameter("discountPercent"));
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<p>Description: " + description + "</p>");
        out.println("<p>List Price: " + listPrice + "</p>");
        out.println("<p>Discount Percent: " + discountPercent + "</p>");
        out.println("<p>Discount Amount: " + (listPrice * discountPercent * 0.01) + "</p>");
        out.println("<p>Discount Price: " + (listPrice - listPrice * discountPercent * 0.01) + "</p>");
        out.println("</body></html>");
    }
}
