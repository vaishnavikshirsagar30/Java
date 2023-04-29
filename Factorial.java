import java.util.Scanner;
class Factorial
 {
      public static void main(String args[]){
         int i, factorial=1, number;
         System.out.println("Enter Number:");
         Scanner sc = new Scanner(System.in);
         number = sc.nextInt();

         for(i = 1; i<=number; i++) {
            factorial = factorial * i;
         }
         System.out.println("Factorial of number is:"+factorial);
      }
   }