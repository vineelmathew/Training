package com.dxctraining;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value="/init",initParams=@WebInitParam(name="start",value ="51")

)
public class ServletInt extends HttpServlet {
private int counter;
public void init() throws ServletException
{
    ServletConfig servletConfig=getServletConfig();
    String value=servletConfig.getInitParameter("start");
    counter=Integer.parseInt(value);
}

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter writer= response.getWriter();
        String startHtml="<!DOCTYPE html>";
        writer.println(startHtml);// writing to output stream
        writer.println("<html><body>");
        writer.println("<h1>count is</h1>"+counter++);
        String endHtml="</body> </html>";
        writer.println(endHtml);
    }
}
