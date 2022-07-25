package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Nana extends HttpServlet {

  @Override
  protected void service(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {
    resp.setCharacterEncoding("UTF-8"); // 유니코드로 보냄
    resp.setContentType("text/html; charset=UTF-8"); // 브라우저에게 유니코드로 해석하라고 명령
    PrintWriter out = resp.getWriter();
    for (int i = 0; i < 100; i++) {
      out.println((i + 1) + "ㅎㅇㅎㅇ날아ㅓㅎㅇㅎㅇㅎㅇㄴㄹ~~~~~~~<br>");
    }
  }
}
