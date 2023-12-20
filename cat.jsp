<html>
<head>
<title>catalog order form</title>
</head>
<body>
<h1 align="center">a sample order form</h1>

<%!
String item[] = {"dvd","cd","diskette"};
double price[] = {19.99,34.0,67.90};
int quantity[] = {2,4,5};
%>
<table align="center" bgcolor="lightgrey" border="1" width="75%">
	<tr>
	<td>item</td>
	<td>price</td>
	<td>quantity</td>
	<td>total price</td>
	</tr>
<% for (int i=0; i<3; i++) { %>
        <tr>
	<td><%= item[i] %></td>
	<td><%= price[i] %></td>
	<td><%= quantity[i] %></td>
	<td><%= price[i] * quantity[i] %></td>
	</tr>
<% } %>
</table>
</body>
</html>