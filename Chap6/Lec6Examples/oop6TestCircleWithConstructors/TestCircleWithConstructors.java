package oop6TestCircleWithConstructors;

import java.util.Scanner;

// TestCircleWithConstructors.java: Demonstrate constructors
public class TestCircleWithConstructors {
  /** Main method */
  public static void main(String[] args) {
    //two objects are created using different constructors
   Scanner s  = new Scanner(System.in); 
   
   
    // Create a Circle with radius 8.0 using non-default constructor
    CircleWithConstructors myCircle =  new CircleWithConstructors(8.0);
    System.out.println("The area of my circle of radius "
      + myCircle.radius+ " is " + myCircle.findArea());
    double r = s.nextInt();
    // Create a Circle with default radius value using no-arg constructor
    CircleWithConstructors yourCircle = new CircleWithConstructors();
    System.out.println("The area of your circle of radius "
      + yourCircle.radius + " is " + yourCircle.findArea());
//your circle's radius is predefined by the no-arg constructor

    // Modify circle radius
    yourCircle.radius = 100;//now your circle's radius changed to 100
    System.out.println("The area of your circle of radius "
      + yourCircle.radius + " is " + yourCircle.findArea());
  }
}
/*Hands on: create another CircleWithConstructor object, print out
its radius and area. Change its radius and print out it area
 again
 */