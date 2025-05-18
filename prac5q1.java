// Q5.1	Write a program that reads data from a char array:  (Please use different loops for the following 3 tasks)
// char [] msg ={'s', 't', 'r', 'e', 's', 's', 'e', 'd'};
// a)	Display the data in normal order. 
// b)	Display the data in reverse order(no need to sort the array).
// c)	Prompt user to choose displaying the above array in normal order or reverse order

import java.util.Scanner;

public class prac5q1{
    public static void main(String[] args) {

        char [] msg ={'s', 't', 'r', 'e', 's', 's', 'e', 'd'};

        for (char letter : msg){
            System.out.print(letter);
        }

        System.out.println("\n");

        for (int i = msg.length - 1; i >= 0; i--) {
            System.out.print(msg[i]);
           
        }

        System.out.println("\n");

        System.out.println("\nInput 1 for normal order or 2 for reverse order");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch(choice){

            case 1:
            for (char letter : msg){
                System.out.print(letter);
            }
            break;

            case 2:
            for (int i = msg.length - 1; i >= 0; i--) {
                System.out.print( msg[i]);
            }
            break;

            default:
            System.out.println("Please key in correct choice next time");
        }


        
    }
}