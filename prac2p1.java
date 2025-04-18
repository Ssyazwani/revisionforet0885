// lesson 2 part 1
//Q2.1 Refer to Lab Guide 2, design a program to get the square of number 11.Please adhere to the good programming habit.

import java.util.Scanner;

public class prac2p1 {

    public static void main(String[] args){

        //2.1
        double y;
        
        while(true){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number to be squared :");
        double x = myObj.nextDouble();
         y = x*x;
        System.out.println("Your new number is " + y);



        }
        

     

    }
    
}
