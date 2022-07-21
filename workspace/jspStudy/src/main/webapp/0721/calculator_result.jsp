<<<<<<< HEAD
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %> <% int num1 = Integer.parseInt(request.getParameter("num1")); int num2 =
Integer.parseInt(request.getParameter("num2")); String oper = request.getParameter("oper"); int result = 0; String operNew = ""; try { switch (oper) { case "plus": operNew = "+"; result = num1 + num2;
break; case "minus": operNew = "-"; result = num1 - num2; break; case "multi": operNew = "*"; result = num1 * num2; break; case "divide": operNew = "/"; if (num2 != 0) { result = num1 / num2; } else {
result = 0; } break; } } catch (Exception e) { System.out.println("오류" + e); } %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>계산 결과</title>
  </head>
  <body>
    <h1>계산 결과</h1>
    <h2><%=num1%> <%=operNew%> <%=num2%> = <%=result%></h2>
  </body>
</html>
=======

>>>>>>> 675dd97798842053e1d638f2a8f7ee1f4dcc15ed
