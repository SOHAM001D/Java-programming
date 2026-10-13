class Marvellous
{
    public int no1;
    public int no2;
    
    public void fun()
    {
        System.out.println("Inside Fun");

    } 
}
class Encapsulation 
{
    public static void main(String A[])
    {
        Marvellous mobj = new Marvellous();
        // mobj.no1 = 11;
        // mobj.no2 = 21;

        // System.out.println("Value of no1 : " + mobj.no1);
        // System.out.println("Value of no2 : " + mobj.no2);

        mobj.fun();
        System.out.println("Value of no1 : " + mobj.no1);
        System.out.println("Value of no2 : " + mobj.no2);
    }
}