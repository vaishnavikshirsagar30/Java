import java.util.Scanner;
class VolumeOfCylinder 
{
   public static void main(String args[]) 
    {   
       
         Scanner SC= new Scanner(System.in);
         double r,h,volume;
        
         System.out.println("Enter the radius=");
         r=SC.nextDouble();
         System.out.println("Enter the height=");
         h=SC.nextDouble();
 
         volume=((22*r*r*h)/7);
 
         System.out.println("volume of Cylinder is: " +volume);
       
 
       
          
   }
}