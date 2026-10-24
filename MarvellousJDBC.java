import java.sql.*;

public class MarvellousJDBC
{
    public static void main(String A[])
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cobj = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
            Statement sobj = cobj.createStatement();
            ResultSet robj = sobj.executeQuery("select * from studentppa");

            while(robj.next())
            {
                System.out.println("Roll number : " + robj.getInt("rno"));
                System.out.println("Name : " + robj.getString("name"));
                System.out.println("City : " + robj.getString("city"));
                System.out.println("Marks : " + robj.getInt("marks"));
                System.out.println("====================================");
            }
            robj.close();
            sobj.close();  
            cobj.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}