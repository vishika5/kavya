<!DOCTYPE html>
<html>
<head>
<title>a catalog order form</title>
</head>
<body>
<h1 align="center">a sample form</h1>
<%!
String item[]={"dvd","cd","diskette"};
double price[]={99.45,12.5,78};
int quantity[]={1,7,8};
%>
<table align=center bgcolor="pink" border="1" width="75%">
<tr>
<td>item</td>
<td>price</td>
<td>quantity</t>
<td>total price</td>
</tr>

<% for(int i=0;i<3;i++) { %>
<tr>
<td><%=item[i]%></td>
<td><%=price[i]%></td>
<td><%=quantity[i]%></td>
<td><%=price[i]*quantity[i]%></td>
</tr>
<% } %>
</table>
</body>
</html>
