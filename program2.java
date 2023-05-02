import java.util.*;
class program2 
{
    public static void main(String arg[])
    {
        int iValue=0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        iValue=sobj.nextInt();
        Number no = new Number();
        no.display(iValue);
    }
    
}
class Number
{
    public void display(int iNo)
    {
        int idigit=0;
        if(iNo<0)
        {
            iNo=-iNo;
        }
        while(iNo>0)
        {
          idigit=iNo%10;
          System.out.print(idigit+" ");
          iNo=iNo/10;
        }
    }
}
