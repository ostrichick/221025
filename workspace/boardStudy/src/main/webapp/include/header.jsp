<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<header>
  <h2>게시판 만들기 연습 페이지</h2>
  <nav>
    <div class="menuArea">
      <ul>
        <li>게시판1</li>
        <li>게시판2</li>
        <li>게시판3</li>
      </ul>
    </div>
    <div class="loginArea">
      <a href="<%=request.getContextPath()%>/index.jsp">메인</a> <a href="<%=request.getContextPath()%>/login/login.jsp">로그인</a> <a href="<%=request.getContextPath()%>/login/join.jsp">회원가입</a>
    </div>
  </nav>
</header>