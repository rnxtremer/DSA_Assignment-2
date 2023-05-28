/*Write a Java program to declare a Class named as Student which contains roll number,
name and course as instance variables and input_Student () and display_Student () as
instance methods. A derived class Exam is created from the class Student. The derived
class contains mark1, mark2, mark3 as instance variables representing the marks of three
subjects and input_Marks () and display_Result () as instance methods. Create an array of
objects of the Exam class and display the result of 5 students.*/

import java.util.Scanner;

class Student {
    protected int rollNumber;
    protected String name;
    protected String course;
    
    public void input_Student() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter roll number: ");
        rollNumber = input.nextInt();
        input.nextLine(); 
        System.out.print("Enter name: ");
        name = input.nextLine();
        System.out.print("Enter course: ");
        course = input.nextLine();
    }
    
    public void display_Student() {
        System.out.println("Roll number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }
}

class Exam extends Student {
    private int mark1;
    private int mark2;
    private int mark3;
    
    public void input_Marks() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter marks for subject 1: ");
        mark1 = in.nextInt();
        System.out.print("Enter marks for subject 2: ");
        mark2 = in.nextInt();
        System.out.print("Enter marks for subject 3: ");
        mark3 = in.nextInt();
    }
    
    public void display_Result() {
        int totalMarks = mark1 + mark2 + mark3;
        System.out.println("Total marks: " + totalMarks);
    }
}

public class Q9 {
    public static void main(String[] args) {
        Exam[] exams = new Exam[5];
        
        for (int i = 0; i < exams.length; i++) {
            exams[i] = new Exam();
            System.out.println("Enter details for student " + (i + 1) + ":");
            exams[i].input_Student();
            exams[i].input_Marks();
        }
        
        for (int i = 0; i < exams.length; i++) {
            System.out.println("Result for student " + (i + 1) + ":");
            exams[i].display_Student();
            exams[i].display_Result();
        }
    }
}
