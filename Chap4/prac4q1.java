package Chap4;
// Q4.1 
//Write a class that contains either of the following method
	/**converts from Celsius to Fahrenheit*/
	// public static double celsiusToFahrenheit(double c)



import java.util.Scanner;

public class prac4q1 {

    public static void main(String[] args) {


        double f=0,c =0;

        f = (9.0/5)*c +32;

        Scanner sc = new Scanner (System.in);
        
        System.out.println("Please enter your temperature in celsius");

        f = sc.nextDouble();

        System.out.println("Your temperature in farenheit is" + celsiusToFahrenheit(f));



        
    }


    
    public static double celsiusToFahrenheit(double c){

        double f = (9.0/5)*c +32;

        return f;
            
    }

  
    
}
