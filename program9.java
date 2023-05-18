import java.util.*;
class program9 
{
    public static void main(String arg[])
    {
    int x=0,y=0,mult=1;
    Scanner sobj = new Scanner(System.in);
    System.out.println("Enter the x and y : ");
    x=sobj.nextInt();
    y=sobj.nextInt();
     for(int i=1;i<=y;i++)
      {
        mult=mult*x;
      }
      System.out.println("power of "+x+ " raised to "+y+ " is : "+mult+" ");
    }
}
