import java.util.*;

class program4 
{
    public static void main(String arg[])
    {
        int iValue=0,count=0,idigit=0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        iValue=sobj.nextInt();
        if(iValue<0)
        {
            iValue=-iValue;
        }
        if(iValue==0)
        {
            System.out.println("number of digits are : 1");
        }
        else{
        while(iValue!=0)
        {
           idigit=iValue%10;
           count++;
           iValue=iValue/10;
        }
        System.out.println("number of digits are : "+count);
    }
    }
    
}
