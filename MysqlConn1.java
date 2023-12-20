import java.sql.*;
import java.lang.*;
class MysqlConn1
{
public static void main(String args[])
{
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kavya","root","root");
PreparedStatement ps=con.prepareStatement("insert into students values(?,?,?)");
ps.setInt(1,4);
ps.setString(2,"vishika");
ps.setString(3,"hyd");
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