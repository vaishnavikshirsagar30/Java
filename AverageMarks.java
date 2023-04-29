import java.util.Scanner;
class AverageMarks
{
   public static void main(String args[])
   {
     
        int mark[] = new int[6],i;
        float sum=0,average; 
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter marks of 6 Subjects:");
        for(i=0; i<6; i++)
        {
            mark[i] = scan.nextInt();
            sum = sum + mark[i];
        }
         average= sum/6;
         System.out.print("Average Marks = " +average);
    }
}