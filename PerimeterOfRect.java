import java.util.Scanner;
class PerimeterOfRect
{
   public static void main(String args[]) 
    {   
       
      	 Scanner SC= new Scanner(System.in);
         double l,b,perimeter;

         System.out.println("Enter the length of the Rectangle="); 
	 l= SC.nextDouble();
	 
	 System.out.println("Enter the width of the Rectangle=");
         b= SC.nextDouble();
          
         perimeter=2*(l+b);
      
	 System.out.println("perimeter of Rectangle is: " + perimeter);      
   }
}