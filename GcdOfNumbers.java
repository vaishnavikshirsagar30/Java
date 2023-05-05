import java.util.Scanner;
class GcdOfNumbers
{
    public static void main(String arg[])	
	{
	 long num1,num2;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter first number");
                num1=sc.nextLong();
             	 System.out.println("enter second number");
                num2=sc.nextLong();
	 if(num1>0 && num2>0)
	 {
	   long result=gcdCal(num1,num2);
     	   System.out.println("Gcd of two numbers = "+result);
	 }  
	else
	    System.out.println("Enter numbers greater than zero");
}
static long gcdCal(long a,long b)
  {
    while (b > 0)
    {
        long temp = b;
        b = a % b; 
        a = temp;
    }
    return a;
   }
}