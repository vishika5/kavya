<html>
<head>
<title>example on expressions,samples,scriplets</title>
</head>
<body>
<p>the square root of 5 is<%=Math.sqrt(5)%></p>
<h2>using scriplets same example is derived</h1>
<%
out.write("<p>the square root of 5 is");
out.print(Math.sqrt(5));
%>
</body>
</html>