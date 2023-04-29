import java.util.Scanner;
 
class CalculateDiscount
{
	public static void main(String args[])
	{
 
	double  discount,amount,price,s;
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter price ");	
               
	price=sc.nextDouble();
 
        System.out.println("enter discount percentage ");	
               
	discount=sc.nextDouble();			
	
        s=100-discount;
 
	amount= (s*price)/100;
 
	System.out.println("amount after discount="+amount);
 
	}
}