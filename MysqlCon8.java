import java.sql.*;
import java.lang.*;
class MysqlCon8
{
public static void main(String args[])
{
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kavya","root","root");
Statement st=con.createStatement();
String s="update students set address='banglore'"+"where id in(1,3)";

st.executeUpdate(s);
con.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}