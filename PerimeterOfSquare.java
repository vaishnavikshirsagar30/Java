import java.util.Scanner;
class PerimeterOfSquare
{
   public static void main(String args[]) 
    {   
       
         Scanner SC= new Scanner(System.in);
         int side,perimeter;
        
         System.out.println("Enter the side of the square=");
         
	 side= SC.nextInt();
	 
         perimeter=4*side;
     
	 System.out.println("perimeter of Square is= " + perimeter);      
   }
}