package Chap2;


//lesson 2
//Q2.2 Write a program that converts Fahrenheit to Celsius. 

import java.util.Scanner;

public class prac2p2 {

    public static void main(String[] args) {

        double c,f;

        Scanner input = new Scanner(System.in); //intialise te scanner
        System.out.println("Please enter your fahrenheit to be converted to celsius");
        f = input.nextDouble(); //data input
        

        c = (f-32.0) * (5.0/9);
    

        System.out.println( "You have entered " + f + " fahrenheit.");
        System.out.println( "It would be " + c + " in celsius.");

    }
    
}
