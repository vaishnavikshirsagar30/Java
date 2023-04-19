import java.util.Scanner;
public class AreaOfParallelogram
{
     public static void main(String args[])
   {
      Scanner SC=new Scanner (System.in);
      int b, h, area;
      System.out.print("Enter the value of b=");
      b = SC.nextInt();
      System.out.print("Enter the value of h=");
      h = SC.nextInt();
      area=b*h;
      System.out.println("The area of the parallelogram ="+area);
   }
}