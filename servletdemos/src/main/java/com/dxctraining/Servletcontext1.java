package com.dxctraining;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/counter1")
public class Servletcontext1 extends HttpServlet {
     @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
             throws ServletException, IOException {
         int counter=0;
         PrintWriter writer= resp.getWriter();
         ServletContext servletContext=req.getServletContext();
         Object obj=servletContext.getAttribute("counter");
        if (obj!=null)
        {
            counter=(Integer)obj;
        }
        counter++;
        servletContext.setAttribute("counter",counter);
        writer.println(counter);
    }
}
