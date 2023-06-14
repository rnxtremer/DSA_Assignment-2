/*Write a Java code that would represent Distance object (meters, centimetres) using classes. The class 
definition include a parameterized constructor, display ( ) to display the instance variables, sum 
(Distance, Distance) to add two distances. Now write a main function that creates a couple of Distance 
objects and demonstrates the addition of two distances. */


import java.util.Scanner;

class Distance {
     int meters;
     int centimeters;
    
    public Distance(int meters, int centimeters) {
        this.meters = meters;
        this.centimeters = centimeters;
    }
    
    public void display() {
        System.out.println("Distance: " + meters + " meters, " + centimeters + " centimeters");
    }
    
    public Distance sum(Distance d1, Distance d2) {
        int totalMeters = d1.meters + d2.meters;
        int totalCentimeters = d1.centimeters + d2.centimeters;
        
        if (totalCentimeters >= 100) {
            totalMeters += totalCentimeters / 100;
            totalCentimeters = totalCentimeters % 100;
        }
        
        return new Distance(totalMeters, totalCentimeters);
    }
}

public class HAQ3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the distance for the first object (meters centimeters):");
        int meters1 = scanner.nextInt();
        int centimeters1 = scanner.nextInt();
        Distance d1 = new Distance(meters1, centimeters1);
        
        System.out.println("Enter the distance for the second object (meters centimeters):");
        int meters2 = scanner.nextInt();
        int centimeters2 = scanner.nextInt();
        Distance d2 = new Distance(meters2, centimeters2);
        Distance sumDistance = d1.sum(d1, d2);
        
        d1.display();
        d2.display();
        sumDistance.display();
    }
}

