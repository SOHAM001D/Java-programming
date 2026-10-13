import java.util.Scanner;

class Addition
{
    public static void main(String A[])
    {
        int no1 = 0, no2 = 0, Ans = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the First Number : ");
        no1 = sobj.nextInt();
        System.out.println("Enter the Second Number : ");
        no2 = sobj.nextInt();

        Ans = no1 + no2;

        System.out.println("Addition of 2 Numbers is : " + Ans);
        
    }

}