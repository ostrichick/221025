<%@ page language="java" contentType="text/html; charset=UTF-8"
		pageEncoding="UTF-8"
%>
<%!int add(int n1, int n2) {
		return n1 + n2;
	};

	int minus(int n1, int n2) {
		return n1 - n2;
	};

	int multi(int n1, int n2) {
		return n1 * n2;
	};

	int divide(int n1, int n2) {
		if (n2 != 0) {
			return n1 / n2;
		} else
			return 0;
	};

	// 	int result(String oper, int n1, int n2) {
	// 		if (oper == "plus")
	// 			return n1 + n2;
	// 		else if (oper == "minus")
	// 			return n1 - n2;
	// 		else if (oper == "multi")
	// 			return n1 * n2;
	// 		else if (oper == "divide" || n2 != 0)
	// 			return n1 / n2;
	// 	}%>
<%
String num1 = request.getParameter("num1");
String num2 = request.getParameter("num2");
String oper = request.getParameter("oper");

int n1 = Integer.parseInt(num1);
int n2 = Integer.parseInt(num2);

int result2 = 0;
String symbol = "";

try {
	switch (oper) {
	case "plus":
		result2 = add(n1, n2);
		symbol = "+";
		break;
	case "minus":
		result2 = minus(n1, n2);
		symbol = "-";
		break;
	case "multi":
		result2 = multi(n1, n2);
		symbol = "*";
		break;
	case "divide":
		symbol = "/";
		result2 = n1 / n2;
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
		<%=n1%>
		<%=symbol%>
		<%=n2%>
		=
		<%=result2%>
</body>
</html>