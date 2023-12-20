import java.sql.*;
import java.lang.*;
class Con4
{
public static void main(String args[])
{
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kavya","root","root");
Statement s=con.createStatement();
ResultSet r=s.executeQuery("select * from students order by name");
while(r.next())
{
System.out.println(r.getInt(1)+" "+r.getString(2)+" " +r.getString(3));
}
con.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}