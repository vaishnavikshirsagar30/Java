import java.util.Scanner;
public class AreaOfTriangle {
   public static void main(String args[]){
      int h, b, area;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the height of the triangle=");
      h= sc.nextInt();
      System.out.println("Enter the base of the triangle=");
      b= sc.nextInt();
      area = (h* b);
      System.out.println("Area of the triangle is="+area);
   }
}