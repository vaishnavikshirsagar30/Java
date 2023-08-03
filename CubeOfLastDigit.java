import java.util.Scanner;
class CubeOfLastDigit
{
public static void main(String args[])
{
Scanner SC =new Scanner(System.in);
int n,d,cube;
System.out.println("Enter a Number");
n=SC.nextInt();
d=n%10;
System.out.println("Last Digit="+d);
cube=d*d*d;
System.out.println("Cube of last digit="+cube);
}
}