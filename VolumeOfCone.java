import java.util.Scanner;
class VolumeOfCone 
{
      
   public static void main(String args[]) 
    {   
       
	
            	Scanner SC= new Scanner(System.in);
                double r,h,volume;
         	System.out.println("Enter the radius of cone=");
         	r=SC.nextDouble();
                System.out.println("Enter the height of cone=");
         	h=SC.nextDouble();

                volume=(22*r*r*h)/(3*7);
 
                System.out.println("Volume Of Cone is=" +volume);       
     }
}