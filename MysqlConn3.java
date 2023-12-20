import java.sql.*;
import java.lang.*;
class MysqlConn3
{
public static void main(String args[])
{
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kavya","root","root");
PreparedStatement ps=con.prepareStatement("delete from students where id =?");

ps.setInt(1,1);
int res=ps.executeUpdate();
System.out.println(res+"records deleted");
con.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}