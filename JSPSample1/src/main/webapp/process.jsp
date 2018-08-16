<html>
<body bgcolor="cyan">
	<%@page errorPage="error.jsp"%>
	<%
		int number1 = Integer.parseInt(request.getParameter("number1"));
		int number2 = Integer.parseInt(request.getParameter("number2"));
		int result = number1 / number2;
	%>
	<h1><%="Result is " + result%></h1>
</body>
</html>