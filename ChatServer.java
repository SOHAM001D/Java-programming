import java.io.*;
import java.net.*;

public class ChatServer
{
    public static void main(String A[]) throws Exception
    {
        ServerSocket ssobj = new ServerSocket(5100);
        System.out.println("Server is running at port 5100");
        Socket sobj = ssobj.accept();
        System.out.println("Client request gets accepted Successfully");

        PrintStream pobj = new PrintStream(sobj.getOutputStream());
        BufferedReader bobj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));
        BufferedReader bobj2 = new BufferedReader(new InputStreamReader(System.in));
       
        System.out.println("Marvellous Server is Running");
        String str1 = null, str2 = null;

        while((str1 = bobj1.readLine()) != null)
        {
            System.out.println("client says : " + str1);
            System.out.println("Enter messege for client : ");
            str2 = bobj2.readLine();
            pobj.println(str2);

        }
    }
}