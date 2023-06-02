/*A point in the x-y plane is represented by its x-coordinate and y-coordinate. Design a class,
PointType in Java, that can store and process a point in the x-y plane. You should then
perform operations on the point, such as showing the point, setting the coordinates of the
point, printing the coordinates of the point, returning the x-coordinate, and returning the ycoordinate. Every circle has a centre and a radius. Given the radius, we can determine the
circle’s area and circumference. Given the centre, we can determine its position in the x-y
plane. The centre of a circle is a point in the x-y plane. Design a class, CircleType that can
store the radius and centre of the circle. Because the center is a point in the x-y plane and
you designed the class to capture the properties of a point from PointType class. You must
derive the class CircleType from the class PointType. You should be able to perform the
usual operations on a circle, such as setting the radius, printing the radius, calculating and
printing the area and circumference, and carrying out the usual operations on the center.*/

class PointType 
{
    double x;
    double y;
    PointType(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    void setCoordinates(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    void printCoordinates() 
    {
        System.out.println("(" + this.x + ", " + this.y + ")");
    }
    double X() 
    {
        return this.x;
    }
    double Y()
    {
        return this.y;
    }
}
class CircleType extends PointType 
{
    double radius;
    public CircleType(double x, double y, double radius) 
    {
        super(x, y);
        this.radius = radius;
    }
    void setRadius(double radius) 
    {
        this.radius = radius;
    }
    void printRadius() 
    {
        System.out.println("Radius is: " + this.radius);
    }
    void printCenter(){
        System.out.println("Center is : "+this.x+","+this.y);
    }
    double getArea() 
    {
        return Math.PI * this.radius * this.radius;
    }
    double getCircumference() 
    {
        return 2*Math.PI*this.radius;
    }
}
public class HW4 
{
    public static void main(String[] args) 
    {
        PointType point = new PointType(1, 2);
        System.out.print("Point: ");
        point.printCoordinates();
        point.setCoordinates(8, 9);
        System.out.print("Now the point is : ");
        System.out.println("("+point.X() + "," + point.Y()+")");
        CircleType circle = new CircleType(1, 2, 5);
        circle.printRadius();
        circle.setRadius(10);
        System.out.print("Updated ");
        circle.printRadius();
        System.out.print("Circle area is : ");
        System.out.println(circle.getArea());
        System.out.print("Circle Circumference is : ");
        System.out.println(circle.getCircumference());
    }
}
