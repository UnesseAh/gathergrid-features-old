package com.gathergrid.controller;

import java.io.*;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "initialServlet", value = "", loadOnStartup = 1)
public class InitialServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}