import java.util.Scanner;
 
class BattingAverage
{
  public static void main(String arg[])
   { 
     
      long Match,run,inning,notout;
      double average;
      
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number of matches played");
      Match=sc.nextLong();
      while(true)
   {
      System.out.println("Enter number of innings batted");
      inning=sc.nextLong();
      if(inning<=Match)
      break;
      System.out.println("Enter number of innings batted correctly <=matches");
     
   }
     while(true)
   {
      System.out.println("Enter number of times notout");
      notout=sc.nextLong();
      if(notout<=inning)
      break;
      System.out.println("Enter the number times became notout correctly <=innings");
   }
      System.out.println("Enter total number of runs scored");
      run=sc.nextLong();
      if(inning==notout)
      average=run;
      else
      average=run/(inning-notout);
      System.out.println("batting average="+average);
    }
}