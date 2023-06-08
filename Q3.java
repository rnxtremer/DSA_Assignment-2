/*Define a class called Student with instance variables Roll, Name, DSA_Mark. Also, the class 
consists of instance methods getdata( ), showdata( ) to provide input to the instance variable 
and to display the value of instance variable. Write a program to create the details of 5 students. 
Display the information of the students who has secured the highest DSA_Mark.*/

/*Define a class called Student with instance variables Roll, Name, DSA_Mark. Also, the class 
consists of instance methods getdata( ), showdata( ) to provide input to the instance variable 
and to display the value of instance variable. Write a program to create the details of 5 students. 
Display the information of the students who has secured the highest DSA_Mark.*/

import java.util.Scanner;
class Student{
	int roll;
	double DSA_Marks;
	String Name;
void getData()
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Name");
	Name = sc.nextLine();
	System.out.println("Enter Roll");
	roll = sc.nextInt();
	System.out.println("Enter DSA_Marks");
	DSA_Marks = sc.nextDouble();
	
}
void showData()
{
	System.out.println("Roll = "+roll+" Name : "+Name+" DSA Marks : "+DSA_Marks);
}
 }
public class Q3 {

	public static void main(String[] args) {
	        Student[] st = new Student[5];

	        // Get input for 5 students
	        for (int i = 0; i < 5; i++) {
	            System.out.println("Enter details for student " + (i + 1));
	            st[i] = new Student();
	            st[i].getData();
	        }

		double max=st[0].DSA_Marks;
		for(int i=0;i<5;i++)
				{
			if(max<st[i].DSA_Marks)
				max=st[i].DSA_Marks;
				}
		for(int i=0;i<5;i++)
		{
			if(st[i].DSA_Marks==max)
				System.out.println("Details of the Student having highest marks: ");
			st[i].showData();
		}
	 }
}

