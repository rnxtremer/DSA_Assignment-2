/*Question:
Define a class Phone to store these three parts of a phone number separately as instance 
variable (area_code, exchange, number). The class consists of two member methods: input ( )
and display ( ). Create two class objects of type phone. Initialize one directly (by using dot (.) 
operator and instance variable with value area_code: 212, exchange: 767, 
number: 8900), and initialize other from the user through member method input ( ). Display 
both the numbers.*/

class Phone 
{
    int area_code;
    int exchange;
    int number;
    
    void input(int a,int e,int n) 
    {
        area_code =a;
        exchange = e;
        number =n;
    }
    
    void display() 
    {
        System.out.printf("(%03d) %03d-%04d", area_code, exchange,number);
    }
}
public class Q1
{
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.area_code=212;
        phone1.exchange=767;
        phone1.number=8900;

        Phone phone2 = new Phone();
        phone2.input(415,555,1212);
        
        System.out.print("My number is ");
        phone1.display();
        
        System.out.print("\nYour number is ");
        phone2.display();
    }
}

