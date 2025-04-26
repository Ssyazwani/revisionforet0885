// Q3.1 Write a Java application to allow user to guess your lucky No.  Your lucky No. is hardcoded in your program. 
//If the user keys in your lucky No, give him a congratulation message, otherwise, show him a "Thank You" message. 
// (a)	use if-else. Please refer to Lab Guide 3-1. 
// (b)	use switch 
// (c)	(optional) use shorthand if-else:     (condition)? vauleIfTrue : valueIfFalse

// Q3.2 Write a program to prompt the user to enter a quiz mark of John. 
//Display a message to show which grade John got (A:80--100, B:70--79, C: 60--69, D: 50--59, F: 0--49).
// (a)	use if -- else if – else
// (b) add some codes to your program so that it can check and display whether the marks entered are valid or not. A valid mark should be between 0 and 100.
// (c) If user enters an invalid mark, allow user to enter again until -1 is entered. 
// •	Please use while loop to handle this part.
// •	Please use do while loop to handle this part.

// Q3.3 (a) Display all the odd numbers between 1 to 9---use if-else and for loop
//      (b) modify your code to display all the odd number between 1--99 in 10 rows, with 5 numbers on each row. ---use nested for loop
//      (c) (optional)modify your code to display times table for even No. between 1 and 9, e.g. 2*2=4 ….8*8=64 in 4 rows and 4 columns.

import java.util.Scanner;

public class prac3q1 {

    public static void main(String[] args) {

        int num_input =0,lucky_guess = 0;
        int lucky_num = 7;
        String strOut = "";

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 to guess the lucky number, Enter 2 to exit");

        num_input = sc.nextInt();

    

            
        switch(num_input)
        {
            case 1 :

            System.out.println("Enter your lucky guess");

            while (true){
                lucky_guess = sc.nextInt();

            System.out.println("You have entered " + lucky_guess);

            if (lucky_guess == lucky_num) {

                strOut = "Congratutlations";
                System.out.println(strOut);
                break;
                 
            } else 

            {
                strOut = "Wrong guess!";
                System.out.println(strOut);
                

            }
            



            }

            

            case 2:

            strOut = "Exiting...";
            break;
        }




        

        
    }
    
}
