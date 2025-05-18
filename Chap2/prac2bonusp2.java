package Chap2;


// Q2.5 Write a program that reads the subtotal and the gratuity rate, and computes the gratuity and total. gratuity = subtotal * gratuity rate /100.0 , total = subtotal + gratuity. e.g. if the user enters 10 for subtotal and 15 (percent) for gratuity rate, the program displays 1.5 as gratuity and $11.5 as total.

import java.util.Scanner;

public class prac2bonusp2 {

    public static void main(String[] args) {

        //Q2.5

        double gratuity_rate, subtotal, total_gratuity;

        Scanner myObj = new Scanner(System.in);

        System.out.println("Please input your subtotal :");

        subtotal = myObj.nextDouble();

        System.out.println("Please input your gratuity rate :");

        gratuity_rate = myObj.nextDouble();

        total_gratuity = subtotal *(gratuity_rate/100.0);

        System.out.println("You have inputted subtotal as " + subtotal);
        System.out.println("You have inputted gratuity rate as " + gratuity_rate);
        System.out.println("Total gratuity calculated : " + total_gratuity);

        

        
    }
    
}
