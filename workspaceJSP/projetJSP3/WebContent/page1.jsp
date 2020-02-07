<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>page1</title>
</head>
<body>
Page1 Session

<%
out.print(session.getAttribute("nom"));

String str = session.getAttribute("nom").toString();
out.print(" je suis page 2 : " + str);
%>

</body>
</html>