import java.util.Scanner;
class Fibonacci
{
     public static void main(String[] args)
     {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter numbers");
	int n=sc.nextInt();
	int i=0,j=1,num;
	System.out.println("Fibonacci series is ");
	for(int c=0;c<n;c++)
      {
	if(c<=1)
	num=c;
	else
      {
	num=i+j;
	i=j;
	j=num;
      }
       System.out.println(num);
      }
      }
}