import java.util.Scanner;
class PerimeterOfEquiTri 
{
   public static void main(String args[]) 
    {   
       
         Scanner SC= new Scanner(System.in);
        
         System.out.println("Enter the side of the Triangle:");
         
	 double side= SC.nextDouble();
 
         double  perimeter=3*side;
      
         System.out.println("perimeter of Triangle is=" + perimeter);      
   }
}