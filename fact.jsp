<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<body>
<center>
<h1> enter the number to get factorial ::</h1>
<%!
long n,result;
String str;
long fact(long n)
{
if (n==0)
return 1;
else
return n*fact(n-1);
}
%>
<%
str=request.getParameter("val");
n=Long.parseLong(str);
result=fact(n);
%>
<b>factorial value</b>
<%= result %>