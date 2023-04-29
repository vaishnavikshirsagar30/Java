import java.util.*; 
class ElectricityBill 
{ 
        public static void main(String args[]) 
        {   
	   long units;
 
	   Scanner sc=new Scanner(System.in);
 
	   System.out.println("enter number of units");
	   
           units=sc.nextLong();
 
     	   double bill=0;
 
           if(units<100)
		bill=units*1.30;
 
    	    else if(units<300)
		bill=100*1.40+(units-100)*2;
 
	    else if(units>300)
		bill=100*1.40+200 *2+(units-300)*3;
 
              System.out.println("Bill to pay : " + bill); 
   } 
}