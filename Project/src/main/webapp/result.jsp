<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" lang="en">
<head>
<meta http-equiv="content-type"
	content="application/xhtml+xml; charset=UTF-8" />
<link rel="stylesheet" type="text/css" href="mystyle.css">
<title>Welcome to the result web page</title>
</head>
<body bgcolor="black">
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
	<c:out value="${result}" escapeXml="false" />
	<br>
	<h4>THE CODE:</h4>
	<c:out value="${code}" escapeXml="false" />
</body>
</html>
