import java.util.Scanner;
class AreaOfIsoscelesTriangle 
{
   public static void main(String args[]) 
    {   
       
         Scanner SC= new Scanner(System.in);
         double a,b,area;

         System.out.println("Enter the length of same sided="); 
         a= SC.nextDouble();
         
         System.out.println("Enter second side of the Triangle=");
         b= SC.nextDouble();
 
         area=(b/4)*Math.sqrt((4*a*a)-(b*b));
      
         System.out.println("Area of Isosceles Triangle is=" +area);
   }
}