package com.mark;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        name = "contextParameterServlet",
        urlPatterns = {"/contextParameters"},
        initParams = {
                @WebInitParam(name = "database", value = "CustomerSupport"),
                @WebInitParam(name = "server", value = "10.0.12.5")
        }
)

public class ContextParameterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        // this 继承了 HttpServlet 所以有 getServletContext 这个方法
        ServletContext c = this.getServletContext();
        PrintWriter writer = response.getWriter();

        writer.append("settingOne: ").append(c.getInitParameter("settingOne"))
                .append(", settingTwo: ").append(c.getInitParameter("settingTwo"));

    }
}
