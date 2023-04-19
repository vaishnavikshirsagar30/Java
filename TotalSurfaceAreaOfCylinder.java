import java.util.Scanner;
class TotalSurfaceAreaOfCylinder 
{
   public static void main(String args[]) 
     {   
          
     	Scanner SC= new Scanner(System.in);
        double r,h,tsa;
        
        System.out.println("Enter the radius=");
         	
      	r=SC.nextDouble();
         	
	System.out.println("Enter the height=");
         	
	h=SC.nextDouble();
 
        tsa=((2*22*r)/7)*(r+h);
 
        System.out.println("Total Surface Area Of Cylinder=" +tsa);
       
 
     }
}