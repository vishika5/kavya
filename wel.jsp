<html>
<body>
<%
String name=request.getParameter("uname");
out.print("welcome"+name);
session.setAttribute("user",name);
%>
</body>
</html>