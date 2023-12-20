<%@ page import="java.io.*,java.util.*,javax.servlet.*"%>
<html>
<head>
<title>display current data and time</title>
</head>
<body>
<center>
<h1>displaying current time&date</h1>
</center>
<%
Date date=new Date();
out.println("<h2 align=\"center\">"+date.toString()+"</h2>");
%>
</body>
</html>