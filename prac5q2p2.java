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
            System.out.println("Please enter your arraysize");
            int arraysize = sc.nextInt();
            double[] userinput = new double[arraysize];
            System.out.println("Please enter the contents of your array");

       

        //   try {
            for (int i = 0; i < arraysize; i++) 
            if (sc.hasNextDouble()) {
                userinput[i] = sc.nextDouble();
            }
            
        // } catch (Exception e) {
        //     System.out.println("Please enter the correct data type");

        // }

        System.out.println(" Your array consists of ");

        for(int i =0; i < userinput.length;i++){
            System.out.println(userinput[i]);
        }

        System.out.println("The average for your array is " + avgArry(userinput));
            
          

        
            
        // throw new InputMismatchException("Please enter the size of the array");

           
         
           
    }

    public static double avgArry(double[ ] a){

        double sum = 0;
        // for loop
        for(int i = 0; i < a.length; i++){
            sum+= a[i];
        }

        double avg = sum/a.length;

        return avg;
    }

    
    
}


