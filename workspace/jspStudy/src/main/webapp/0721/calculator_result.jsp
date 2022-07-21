<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"
%>
<%!// int add(int n1, int n2) {
	// 		return n1 + n2;
	// 	};

	// 	int minus(int n1, int n2) {
	// 		return n1 - n2;
	// 	};

	// 	int multi(int n1, int n2) {
	// 		return n1 * n2;
	// 	};

	// 	int divide(int n1, int n2) {
	// 		if (n2 != 0) {
	// 			return n1 / n2;
	// 		} else
	// 			return 0;
	// 	};

	// 	int result(String oper, int n1, int n2) {
	// 		if (oper == "plus")
	// 			return n1 + n2;
	// 		else if (oper == "minus")
	// 			return n1 - n2;
	// 		else if (oper == "multi")
	// 			return n1 * n2;
	// 		else if (oper == "divide" || n2 != 0)
	// 			return (double) n1 / n2;
	// 	}%>
<%
int num1 = Integer.parseInt(request.getParameter("num1"));
int num2 = Integer.parseInt(request.getParameter("num2"));
String oper = request.getParameter("oper");

int result = 0;
String symbOper = "";

try {
	switch (oper) {
	case "plus":
		symbOper = "+";
		result = num1 + num2;
		break;
	case "minus":
		symbOper = "-";
		result = num1 - num2;
		break;
	case "multi":
		symbOper = "*";
		result = num1 * num2;
		break;
	case "divide":
		symbOper = "/";
		if (num2 != 0) {
	result = num1 / num2;
		} else
	result = 0;
		break;
	}
} catch (Exception e) {
	System.out.println("오류" + e);
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h3>계산 결과</h3>
  <%=num1%>
  <%=symbOper%>
  <%=num2%>
  =
  <%=result%>
</body>
</html>