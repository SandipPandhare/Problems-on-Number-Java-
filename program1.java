
import java.util.*;

class program1
{
    public static void main(String arg[])
    {
        int iValue=0,idigit=0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        iValue=sobj.nextInt();
        if(iValue<0)
        {
            iValue=-iValue;
        }
        while(iValue>0)
        {
            idigit=iValue%10;
            System.out.print(idigit+" ");
            iValue=iValue/10;
        }

    }
}