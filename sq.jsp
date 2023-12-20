<html>
<head>
<title>expressions</title>
</head>
<body>
<p>the square root of 5 is <%=Math.sqrt(5)%></p>
<p>the same example derived using scriplets</p>
<% 
out.write("<p>the square root of 5 is");
out.print(Math.sqrt(5));
%>
</body>
</html>