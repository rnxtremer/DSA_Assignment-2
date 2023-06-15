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


import java.util.Scanner;

class PointType {
     double x;
     double y;
    
    public PointType(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public void setCoordinates(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public void printCoordinates() {
        System.out.println("Coordinates: (" + x + ", " + y + ")");
    }
    
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
}

class CircleType extends PointType {
    private double radius;
    
    public CircleType(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public void printRadius() {
        System.out.println("Radius: " + radius);
    }
    
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}

public class HAQ4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the coordinates of the center point (x y):");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        
        System.out.println("Enter the radius of the circle:");
        double radius = scanner.nextDouble();
        CircleType circle = new CircleType(x, y, radius);
        
        circle.printCoordinates();
        circle.printRadius();
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Circumference: " + circle.calculateCircumference());
    }
}
