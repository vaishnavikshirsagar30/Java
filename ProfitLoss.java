import java.util.*;
class ProfitLoss
{
public static void main(String args[])
{
Scanner SC = new Scanner(System.in);
int Selling_price, Cost_price;

System.out.println("Enter Cost_Price");
Cost_price=SC.nextInt();

System.out.println("Enter Selling_Price");
Selling_price=SC.nextInt();

if(Selling_price > Cost_price)
{
 System.out.println("Profit");

}
else
{
System.out.println("Loss");
}
}
}