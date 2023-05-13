import java.util.*;
class program5
{
    public static void main(String arg[])
    {
        int iValue=0,iSum=0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        iValue=sobj.nextInt();
        for(int i=1;i<=iValue;i++)
        {
            iSum+=i;
        }
        System.out.println("sum of numbers is : "+iSum);
    }
    
}
