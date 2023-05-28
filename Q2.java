/*Define a class called Complex with instance variables real, imag and instance methods
setData(), display(), add(). Write a Java program to add two complex numbers.
The prototype of add method is: 
public Complex add(Complex, Complex).*/

import java.util.*;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex c1=new Complex();
		Complex c2=new Complex();
		
		System.out.println("Enter the value of first complex number");
		c1.setData();
		System.out.println("Enter the value of second complex number");
		c2.setData();
		System.out.println("First complex number is:");
		c1.Display();
		System.out.println("Second complex number is:");
		c2.Display();
		Complex c3= new Complex();
		c3=c3.add(c1,c2);
		System.out.println("Sum of the two Complex Number is:");
	    c3.Display();
	}

}
class Complex{
	Scanner sc=new Scanner(System.in);
	int real;
	int imag;
	void setData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the real no.");
		real=sc.nextInt();
		System.out.println("Enter the imaginary no.");
		imag=sc.nextInt();
	}
		void Display()
		{
			System.out.println("The complex no. is "+real+"+"+imag+"i");
			
		}
		public Complex add(Complex c1,Complex c2)
		{
			Complex c=new Complex();
			c.real=c1.real+c2.real;
			c.imag=c1.imag+c2.imag;
			return c;
		
	}
	
}
