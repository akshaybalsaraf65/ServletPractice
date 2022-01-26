<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>hello</h1>

<%!

int i;
%>
<%

try{
	i = 9 + 2;
}catch(Exception e){
	out.println(e);
}


out.println(i);
%>
</body>
</html>