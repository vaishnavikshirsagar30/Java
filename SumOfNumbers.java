import java.util.*;
class SumOfNumbers
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter Number of Numbers to be Calculated: ");
int n=sc.nextInt();
int i,sum=0,x;
for(i=0;i<n;i++)
{
System.out.print("\n Enter: ");
x=sc.nextInt();
sum=sum+x;  
}
System.out.println("Sum of the numbers: "+sum);
}
}