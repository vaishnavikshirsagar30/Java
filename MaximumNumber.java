import java.util.*;
class MaximumNumber
{
public static void main(String args[])
{
Scanner SC=new Scanner(System.in);
int a,b;

System.out.println("Enter First Number");
a=SC.nextInt();

System.out.println("Enter Second Number");
b=SC.nextInt();

if(a>b)
{
System.out.println("maximum number="+a);
}
else
{
System.out.println("maximum number="+b);
}
}
}
