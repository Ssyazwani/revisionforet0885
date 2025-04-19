//Q2.3 Write a program to the prompt the user to enter a voltage and a resistance for a resistor. Calculate and display the current. Note: current = voltage / resistance.

// Q2.4 Write a program that prints a face, hopefully better looking than this one:
//     / / / / / 
//    |  Q   Q  |
//   {|    /\   |}
//    |   \__/  |
//     \--------/     
// Use comments to indicate when you print the hair, ear, mouth, and so on. 
// Hint: to print out "\", use "\\"

// Q2.5 Write a program that reads the subtotal and the gratuity rate, and computes the gratuity and total. gratuity = subtotal * gratuity rate /100, total = subtotal + gratuity. e.g. if the user enters 10 for subtotal and 15 (percent) for gratuity rate, the program displays 1.5 as gratuity and $11.5 as total.

import java.util.Scanner;

public class prac2bonus {

    public static void main(String[] args) {
        //Q2.3

        Scanner myObj = new Scanner(System.in);

        System.out.println("Please enter your voltage and resistence to help calculate the current used. \n");
        System.out.println("Please enter your Voltage: ");

        double v = myObj.nextDouble();

        System.out.println("Please enter your Resistance: ");

        double r = myObj.nextDouble();

        double c = v * r;

        System.out.println( "Voltage entered : "  + v);
        System.out.println( "Resistence entered : "  + r);
        System.out.println( "Current calculated : "  + c);


    }
    
}
