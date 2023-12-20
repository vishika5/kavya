import java.sql.*;
class Conn2
{
public static void main (String args[])
{
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kavya","root","root");
PreparedStatement ps=con.prepareStatement("select * from students where name=?");

ps.setString(1,"kavya");
ResultSet rs=ps.executeQuery();
while(rs.next())
{
System.out.println(rs.getInt(1)+""+rs.getString(2)+""+rs.getString(3));
}
con.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}