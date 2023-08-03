import java.util.Scanner;
class LastDigit
{
public static void main(String args[])
{
Scanner SC =new Scanner(System.in);
int n,d;
System.out.println("Enter a Number");
n=SC.nextInt();
d=n%10;
System.out.println("Last Digit="+d);
}
}