import java.sql.*;
import java.lang.*;
class MysqlConn2
{
public static void main(String args[])
{
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kavya","root","root");
PreparedStatement ps=con.prepareStatement("update students set address=? where id =?");

ps.setString(1,"korea");
ps.setInt(2,4);
int res=ps.executeUpdate();
System.out.println(res+"records inserted");
con.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}