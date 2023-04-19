import java.util.Scanner;
class PerimeterOfRhombus
{
   public static void main(String args[]) 
    {   
       
      	 Scanner SC= new Scanner(System.in);
         double side, perimeter;
         System.out.println("Enter the side of the Rhombus=");
         
         side= SC.nextDouble();
	 
         perimeter=4*side;
      
	 System.out.println("perimeter of Rhombus is= " + perimeter);      
   }
}