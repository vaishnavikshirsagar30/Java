import java.util.Scanner;
class PerimeterOfParallelogram
{
   public static void main(String args[]) 
    {   
       
         Scanner SC= new Scanner(System.in);
        
         System.out.println("Enter height= ");
         
         double h= SC.nextDouble();
	 
	 System.out.println("Enter the breadth=");
         
	 double b= SC.nextDouble();
          
         double  perimeter=2*(h+b);
     
	 System.out.println("perimeter of Parallelogram is= " + perimeter);      
   }
}