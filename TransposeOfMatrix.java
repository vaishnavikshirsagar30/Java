import java.util.*;
class TransposeOfMatrix
{
  public static void main(String []args)
   {
      Scanner SC= new Scanner(System.in);
      int a[][]=new int[3][3];     
      int b[][]=new int[3][3];
      int i,j;                     
      System.out.println("Enter elements for matrix:");
      for(i=0;i<a.length;i++)
 {
   for(j=0;j<a[i].length;j++)
 {
   a[i][j]=SC.nextInt();
 }
 }
   System.out.println("First Matrix");
   for(i=0; i<a.length;i++)
 {
   for(j=0; j<a[i].length;j++)
 {
   System.out.println(a[i][j]+"\t");
 }
   System.out.println();
 }
   System.out.println("Transpose of matrix:");
   for(i=0;i<b.length;i++)
 {
   for(j=0;j<b[i].length;j++)
 {
   b[i][j]=a[i][j];
   System.out.print(b[i][j]+"\t");
 }
   System.out.println();
 }
 }
 }
      