<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"
%>
<%
//쿠키제거
Cookie[] cookies = request.getCookies();
for (Cookie cookie : cookies) {
	if (cookie.getName().equals("cookieTest")) {
		cookie.setMaxAge(0);
		response.addCookie(cookie);
		break;
	}
}
response.sendRedirect("ex01_cookie.jsp");
%>