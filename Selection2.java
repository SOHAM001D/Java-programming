import java.util.*;

class Selection2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int age = 0;

        System.out.println("Enter Your Age :");
        age = sobj.nextInt();

        if(age >= 18)
        {
            System.out.println("Allowed to watch movie");
        }
        else
        {
            System.out.println("Not Allowed to watch Movie ");
        }
    }
}