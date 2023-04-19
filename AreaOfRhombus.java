import java.util.Scanner;
class AreaOfRhombus 
{
   public static void main(String args[]) 
    {   
       
         Scanner SC= new Scanner(System.in);
         System.out.println("Enter the value of 1st diagonal:");
         double d1= SC.nextDouble();
         System.out.println("Enter the value of 2nd diagonal:");
         double d2= SC.nextDouble();
          
         double  area=(d1*d2)/2;
         System.out.println("Area of Rhombus is: " + area);      
    }
}