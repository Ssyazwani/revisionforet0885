package Chap5;
// Q5.3 Continued from Q5.2, in the main method, 
// a)	Prompt user to enter the array size, with InputMismatchException handled, till the array size is a valid No.
// b)	Declare and create a double array with size decided by user in a)
// c)	Prompt user to enter the array element value one by one using loop with Exception handled
// d)	Call method avgArry(double[ ] a) of Q5.2 to calculate the average of all the elements’ values of the above array , 
//then print out the average value.

import java.util.InputMismatchException;
import java.util.Scanner;

public class prac5q2p2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraysize = 0;

       
        System.out.println("Please enter your arraysize:");
            
        while (true) {
                try {
                   arraysize = sc.nextInt();
                    break; 
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number.");
                    sc.next(); 
            }
        }
    
        double[] userinput = new double[arraysize];
        System.out.println("Please enter the contents of your array:");

        for (int i = 0; i < arraysize; i++) {
            while (true) {
                try {
                    userinput[i] = sc.nextDouble();
                  break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number.");
                    sc.next(); 
            }
        }

        System.out.println("Your array consists of:");
        for (int j = 0; j < userinput.length; j++) {
            System.out.println(userinput[j]);
        }

        System.out.println("The average for your array is " + avgArry(userinput));
    }

}

    public static double avgArry(double[] a) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum / a.length;
    }
}



