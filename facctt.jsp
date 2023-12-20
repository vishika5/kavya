<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<body>
<center>
<h1>the required factorial value is::</h1>
<%!
long n,result;
String str;
long fact(long n)
{
if(n==0)
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
<b>factorial value:</b><%=result %>