// Q3.2 Write a program to prompt the user to enter a quiz mark of John. 
//Display a message to show which grade John got (A:80--100, B:70--79, C: 60--69, D: 50--59, F: 0--49).
// (a)	use if -- else if – else
// (b) add some codes to your program so that it can check and display whether the marks entered are valid or not. A valid mark should be between 0 and 100.
// (c) If user enters an invalid mark, allow user to enter again until -1 is entered. 
// •	Please use while loop to handle this part.
// •	Please use do while loop to handle this part.

import java.util.Scanner;

public class prac3q2 {
    
    public static void main(String[] args) {

        int y=0;
        
        while(true){

            System.out.println("Please enter quiz mark for John");

            Scanner sc = new Scanner(System.in);

            y = sc.nextInt();

            if(80 <= y && y <= 100){

                System.out.println("The marks you have entered is valid");
                System.out.println("You got an A");
                break;


            } else if (70 <= y &&  y < 80){

                System.out.println("The marks you have entered is valid");
                System.out.println("You got a B");
                break;


            } else if (60 <= y &&  y < 70){
                
                System.out.println("The marks you have entered is valid");
                System.out.println("You got a C");
                break;


            } else if (50 <= y &&  y < 60 ){

                System.out.println("The marks you have entered is valid");
                System.out.println("You got a D");
                break;

            } else if ( 0 <= y && y <= 49){

                System.out.println("The marks you have entered is valid");
                System.out.println("You got a F");
                break;

            }  else if (y == -1){

                System.out.println("The marks you have entered is invalid");
                break;

            } else {

                System.out.println("Try again");
            }



        }
    }
}
