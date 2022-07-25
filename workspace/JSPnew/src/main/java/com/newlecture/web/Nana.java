package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class Nana extends HttpServlet {

  /**
   *
   */
  private static final long serialVersionUID = -5173251285006315519L;

  @Override
  protected void service(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {
    //		super.service(req, resp);
    PrintWriter out = resp.getWriter();
    out.println("야호~");
  }
}
