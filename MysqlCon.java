import java.sql.*
class Con2
{
public static void main(String args[])
{
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con=("jdbc:mysql://localhost:3306/kavya","root","root");
Statement st=con.createStatement();
RESULTSET rs=st.executeQuery("select * from students order by name");
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