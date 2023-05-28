/*A sales person is paid commission based on the sales he makes as shown by the following
table:
SALES COMMISSION
Under Rs. 100 2% of SALES
Rs 100 and under Rs 500 3% of SALES
Rs 500 and under Rs 5000 5% of SALES
Rs 5000 and above 8% of SALES
Write a class, Commission, which has:
 An instance variable, sales; an appropriate constructor; and a method, getCommission()
that returns the commission.
Now write a Demo class in Java to test the Commission class by reading a sale from the
user, using it to create a Commission object after validating that the value is not negative.
Finally, call the getcommission() method to get and print the commission. 
If the sales are negative, your Demo class should print the message “Invalid Input”*/

import java.util.*;
class Commission 
{
    double sales;    
    Commission(double sales) 
    {
        this.sales = sales;
    }
    
    public double getCommission() 
    {
        if (sales <0)
        {
            System.out.println("Invalid Input");
            return 0; 
        }
        else if (sales < 100) 
            return 0.02 * sales;
        else if (sales < 5000) 
            return 0.05 * sales;
        else 
            return 0.08 * sales;
        
    }
}
class HAQ1
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);        
        System.out.print("Enter the sale: ");
        double sale = obj.nextDouble();
        
        Commission com = new Commission(sale);
        double com_amt = com.getCommission();
        
        if (com_amt > 0)
            System.out.println("The commission is Rs " + com_amt);
    }
}
