<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!-- isELIgnored tag is using while DWM lower than 2.4version or browser is auto ignored EL language-->    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	if(request.getAttribute("error").toString().length() == 0) {
%>
	Result is : <%= request.getAttribute("result") %>
	==
	Result is : ${result}
<%
	} else {
%>
	${error}
<%
	}
%>
	 
</body>
</html>