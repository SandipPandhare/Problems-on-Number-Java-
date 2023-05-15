import java.util.*;
class program7
{
    public static void main(String arg[])
    {
        int iValue=0,iSum=0,iNo=0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        iValue=sobj.nextInt();
        iNo=iValue;

        for(int i=1;i<=iValue/2;i++)
        {
           if(iValue%i==0)
           {
               iSum+=i;
           }
        }
        System.out.println("Addition of factors i : "+iSum);

        if(iNo==iSum)
        {
            System.out.println("Number is perfect");
        }
        else
        {
            System.out.println("Number is not perfect");
        }
    }
}