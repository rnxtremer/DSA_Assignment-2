/*Define a class called product. Two instance variables of the class are pid (product-id) and 
price (product price). It consists of one static variable tot_price (total price). Initialize the value 
of instance variables through parameterized constructor. It consists of a display ( ) method to 
display the value of instance variables. A person went to market and purchase 5 different 
products. Using the above mentioned class, display the details of products that the person has 
purchased. Also, determine how much total amount the person will pay for the purchase of 5 
products.*/

import java.util.Scanner;
class Product
{
	int pid;
	double price;
	static double tot_price=0;
	Product(int a,double b)
	{
		pid=a;
		price=b;
		tot_price+=this.price;
	}
	void display()
	{
		System.out.println("Product id: "+pid+" Price: "+price);
	}
}
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Product[]p=new Product[5];
Scanner sc = new Scanner(System.in);
for(int i=0;i<5;i++)
{
	System.out.println("Enter pid and price of the product");
	int pid=sc.nextInt();
	double price=sc.nextDouble();
	p[i]=new Product(pid,price);
}
for(int i =0;i<5;i++)
{
	p[i].display();
}
System.out.println("Total price of the Product = "+Product.tot_price);
	}

}
