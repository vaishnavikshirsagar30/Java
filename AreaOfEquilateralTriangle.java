import java.util.Scanner;
class AreaOfEquilateralTriangle 
{
   public static void main(String args[]) 
    {   
          Scanner SC= new Scanner(System.in);
          System.out.println("Enter the side of the Triangle:");
          double side= SC.nextDouble();
          double  area=(Math.sqrt(3)/4)*(side*side);
          System.out.println("Area of Equilateral-Triangle is: " + area);      
     }
}