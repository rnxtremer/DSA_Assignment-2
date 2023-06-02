/*Create an interface RestaurantMeal that holds the name and price of a food item served by a 
restaurant. The name is initialized as steak dinner and price is initialized as 600. Create an 
interface HotelService that holds the name of the service, the service fee, and the room number 
to which the service was supplied. Initialize the service as room service, service fee as Rs 24, 
and room number as 1202. Create a RoomServiceMeal class that inherits from both 
RestaurantMeal and HotelService. The RoomServiceMeal class consists of display method
() to display the value of members of interface. Additionally, the display function should 
display the total of the meals plus the room service fee. In a main () function, instantiate a 
RoomServiceMeal object.*/

class RestaurantMeal 
{
    String name;
    double price;
    RestaurantMeal(String name, double price) 
    {
        this.name = name;
        this.price = price;
    }
    void display()
    {
        System.out.printf("A \""+name+"\" costing Rs."+ price);
    }
}
interface HotelService
{
    String serviceName();
    double serviceFee();
    String RoomNo();
}
class RoomServiceMeal extends RestaurantMeal implements HotelService 
{
    String room;
    double fee;
    public RoomServiceMeal(String name, double price, String room) 
    {
        super(name, price);
        this.room = room;
        this.fee = 24.00;
    }

    public String serviceName() 
    {
        return "room service";
    }

    public double serviceFee() 
    {
        return fee;
    }
    public String RoomNo() 
    {
        return room;
    }
    double getPrice()
    {
        return 600;
    }
    public void display()
    {
        super.display();
        System.out.print(" is a \""+ serviceName()+"\"" +" provided to room "+RoomNo()+" for a Rs "+serviceFee());
        
    } 
}
public class HW5
 {
    public static void main(String[] args) 
    {
        RoomServiceMeal meal = new RoomServiceMeal("steak dinner", 600.00, "1202");
        meal.display();
    }
}
