import java.util.Scanner;
class PerimeterOfCircle 
{
   public static void main(String args[]) 
    {   
       
     	 Scanner SC= new Scanner(System.in);
        
         System.out.println("Enter the radius:");
         
	 double r= SC.nextDouble();
         
	 double  perimeter=(22*2*r)/7 ;
      
	 System.out.println("Perimeter of Circle is: " +perimeter);      
   }
}