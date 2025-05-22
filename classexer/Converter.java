package classexer;

import java.util.Scanner;

//Q6.5.1 Design a Convertor class with two methods having following signature (similar to the method in Q4.1 of Practical 4)
//	public static double cToF(double c) //a static method
/**it takes temperature in Celsius and converts it to Fahrenheit, then return the conversion result. fahrenheit = (9.0/5)*celsius +32*/
//	public double fToC (double f) //a non static method
/** it takes temperature in Fahrenheit and converts it to Celsius, 
      celsius = (fahrenheit -32) *5.0/9   */
//Q6.5.2 Design a testing class. In its main method: 
//•	create an object from Convertor class
//	prompt user to enter a temperature in Celsius, call relevant method of Convertor class to convert it to Fahrenheit equivalent. Print the result out.
// Using the other way to call the same method of Convertor class and print the result out again. Any result difference between the 2 calls?____ /
//	prompt user to enter an temperature in Fahrenheit, call relevant method of  Convertor class to convert it to Celsius equivalent. Print the result out.


public class Converter {

    public static double cToF(double c){
        return (9.0/5)*c +32;
    
}

     public double fToC (double f){
    return (f-32) *5.0/9 ;

}

public static void main(String[] args) {

   
    Converter test1 = new Converter();

    System.out.println("Please enter the temperature in Celsius");

    Scanner value = new Scanner(System.in);

    double celsius = value.nextDouble();
    double fahrenheit = cToF(celsius);

    System.out.println("Temperature in Fahrenheit: " + fahrenheit);

    double fahrenheit2 = test1.cToF(celsius);
    System.out.println("Fahrenheit value for second method : " + fahrenheit2);

    if (fahrenheit == fahrenheit2) {
            System.out.println("Both results are the same.");
        } else {
            System.out.println("There is a difference in results!");
        }


    System.out.println("Please enter the temperature fahrenheit");
    double f = value.nextDouble();
    double c = test1.fToC(f);

    System.out.println("Temperature in Celsius: " + c);

  



    
}

    
}

