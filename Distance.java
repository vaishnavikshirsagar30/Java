import java.util.Scanner;
class Distance
{
    public static void main(String[] args)
 {

    Scanner scan = new Scanner(System.in);
    int x1, x2, y1, y2, x, y;
    double distance;
    System.out.print("Enter first point: ");
    x1 = scan.nextInt();
    y1 = scan.nextInt();
    System.out.print("Enter second point: ");
    x2 = scan.nextInt();
    y2 = scan.nextInt();

    x = x2-x1;
    y = y2-y1;
    distance = Math.sqrt(x*x + y*y);

    System.out.println("Distance between Two points= " + distance);
  }
}