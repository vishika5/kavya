<%@ page import="java.io.*,java.util.*,javax.servlet.*"%>
<html>
<head>
<title>display current date and time</title>
</head>
<body>
<h1>display current date&time::</h1>
<%
Date date=new Date();
out.print("<h1 align=\"center\">"+date.toString()+"</h1>");
%>
</body>
</html>