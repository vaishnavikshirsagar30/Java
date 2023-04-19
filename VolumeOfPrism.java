import java.util.Scanner;
class VolumeOfPrism 
{
   public static void main(String args[]) 
    {   
       
         Scanner SC= new Scanner(System.in);
         double base,height,volume;

         System.out.println("Enter the base=");
         base=SC.nextDouble();

         System.out.println("Enter the height=");
         height=SC.nextDouble();

         volume=base*height;
         System.out.println("Volume Of Prism is=" + volume);      
   }
}