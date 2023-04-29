import java.util.Scanner;
class Commission
{
	public static void main(String arg[])	
	{

	  Scanner sc=new Scanner(System.in);
	  System.out.print("Enter amount:"); 
	  double amount=sc.nextDouble(); 

	  System.out.print("Enter commissionPercentage:");
          double Percentage=sc.nextDouble();
 
	  double commission=(Percentage/100)*amount;  	   
      	  System.out.println("Commission amount="+commission);
 
	}
}