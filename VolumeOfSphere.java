import java.util.Scanner;
class VolumeOfSphere 
{
      
   public static void main(String args[]) 
    {   
       
	
            	Scanner SC= new Scanner(System.in);
                double r,volume;
         	System.out.println("Enter radius of sphere:");
         	r=SC.nextDouble();

                volume= (4*22*r*r*r)/(3*7);
 
                System.out.println("Volume of sphere:" +volume);
      }
}