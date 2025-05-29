package Chap4;

import java.util.Scanner;

//4.2    Write a method with the following header that displays a message n times using for loop , then while, then do while loop. 
// Write a test program to use this method.



public class prac4q2 {
    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter how many times you would like to display your message");

        int n = sc.nextInt();

        displayMessage(n);
        
        
    }

public static void displayMessage(int n) {
    String message = "Welcome, Welcome, Dun Dun Dun";

    for (int i = 0; i < n; i++) {
        System.out.println(message);
    }
}


}





