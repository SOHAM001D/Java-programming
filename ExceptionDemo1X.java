import java.util.*;

class ExceptionDemo1X
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int no1 = 0,no2 = 0, Ans = 0;

        try 
        {
            System.out.println("Enter First Number :");
            no1 = sobj.nextInt();

            System.out.println("Enter Second Number :");
            no2 = sobj.nextInt();

            Ans = no1 / no2;                //Excepton prone code

        }
        catch(ArithmeticException aobj)
        {
            System.out.println("Exception Occured"+ aobj);
        }
        finally
        {
            System.out.println("Inside Finally block");
        }
        System.out.println("Division is : "+ Ans);
    }
}