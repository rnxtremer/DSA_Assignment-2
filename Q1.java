/*Define a class Phone to store these three parts of a phone number separately as instance 
variable (area_code, exchange, number). The class consists of two member methods: input ( )
and display ( ). Create two class objects of type phone. Initialize one directly (by using dot (.) 
operator and instance variable with value area_code: 212, exchange: 767, 
number: 8900), and initialize other from the user through member method input ( ). Display 
both the numbers*/


import java.util.Scanner;
class Phone {
	int Area_Code,Exchange,Number;
	void input()
	{
		Scanner sc = new Scanner(System.in);
	    Area_Code=sc.nextInt();
		Exchange=sc.nextInt();
		Number=sc.nextInt();
	}
	void Display()
	{
		System.out.println("("+Area_Code+")"+Exchange+"-"+Number);
	}
}
public class Q1
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
Phone obj1=new Phone();
Phone obj2=new Phone();
System.out.println("Enter Area Code,Exchange and Number obj1");
obj1.Area_Code=sc.nextInt();
obj1.Exchange=sc.nextInt();
obj1.Number=sc.nextInt();
System.out.println("Enter Area Code,Exchange and Number obj2");
obj2.input();
System.out.println("My Number is :");
obj1.Display();
System.out.println("Your Number is :");
obj1.Display();
	}

}
