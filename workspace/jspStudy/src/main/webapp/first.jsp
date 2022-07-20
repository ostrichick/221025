<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %> <% //스크립틀릿 - jsp에서 java 실행문을 선언 %> <%int num1 = 10; int num2 = 20; %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Insert title here</title>
  </head>
  <body>
    <h1>ㅇㅅㅇㅅㅇ</h1>
    첫뻔재 jsp
    <ul>
      <li>fsdf</li>
      <li>df</li>
    </ul>
    <%=10%><!-- 익스프레션 태그-  jsp에서 연산식, 데이터, 변수를 사용하는 영역 -->
    / <%=num1 %> / <%=num2 %> / <%=num1 +num2%>
    <br />num1이 num2보다 큰지에 대한 결과를 출력 <br /><%=num1>num2 %>
  </body>
</html>
