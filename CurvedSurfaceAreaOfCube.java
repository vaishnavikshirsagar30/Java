import java.util.Scanner;
class CurvedSurfaceAreaOfCube 
{
      
   public static void main(String args[]) 
    {   
       
	
         Scanner SC= new Scanner(System.in);
         double side,surfacearea;
         
	 System.out.println("Enter the side of cube=");
         
	 side=SC.nextDouble();
       
         surfacearea=4*side*side;
 
         System.out.println("Curved Surface Area Of Cube=" +surfacearea);
   
   }
}