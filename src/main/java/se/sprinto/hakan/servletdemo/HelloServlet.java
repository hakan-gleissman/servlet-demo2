package se.sprinto.hakan.servletdemo;


import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.getWriter().println("Hallå nu är texten uppdaterad!");
        resp.getWriter().println("Wohoo!");
        resp.getWriter().println(req.getParameter("name"));
        String path = req.getPathInfo();
        resp.getWriter().println(path != null && !path.isEmpty() ? path.substring(1) : "");
    }
}
