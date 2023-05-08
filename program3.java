import java.util.*;
class program3 
{
    public static void main(String arrg[])
    {
    int iValue=0,result=0;
    int sum=0;
    int idigit=0;
    Scanner sobj = new Scanner(System.in);
    System.out.println("Enter Number : ");
    iValue=sobj.nextInt();
    if(iValue<0)
    {
        iValue=-iValue;
    }
  
    while(iValue!=0)
    {
      idigit=iValue%10;
      sum+=idigit;
      iValue=iValue/10;
    }
     System.out.println("sum is : "+sum);
    }
    
}
