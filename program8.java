import java.util.*;
class program8 
{
    public static void main(String arg[])
    {
        int iValue=0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        iValue=sobj.nextInt();

        System.out.println("Multiplication table of " +iValue+ " Number");
        for(int i=1;i<=10;i++)
        {
          System.out.println(+iValue+" * " +i+ " = " +iValue*i+" ");
        }
    }
    
}
