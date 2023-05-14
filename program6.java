import java.util.*;
class program6 
{
    public static void main(String arg[])
    {
        int iValue=0,iNo=0,idigit=0,rev=0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        iValue=sobj.nextInt();
        iNo=iValue;
        
        while(iValue!=0)
        {
            idigit=iValue%10;
            rev=(rev*10)+idigit;
            iValue=iValue/10;
        }
        System.out.println("reverse number is : "+rev);
        
        if(iNo==rev)
        {
            System.out.println("Number is pallindrome");
        }
        else
        {
            System.out.println("Number is not pallindrome");
        }
    }
}
