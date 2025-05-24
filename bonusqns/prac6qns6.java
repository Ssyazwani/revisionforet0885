package bonusqns;
//Q6.6   Use built in Java class Arrays static method sort(double [ ] a )  
//to sort an 1D array {98, 47, 27, 68, 100, 9.5} ,then print out the sorted array’s element value one by one.

import java.util.Arrays;

public class prac6qns6 {

    public static void main(String[] args) {
         double [] array = {98, 47, 27, 68, 100, 9.5};

          System.out.print("Unsorted array : ");

          for(int i =0; i < array.length;i ++){
            System.out.print(array[i]+ ",");
         }

        System.out.println();

         System.out.print("Sorted array : ");
         for(int i =0; i < array.length;i ++){
            Arrays.sort(array); // using Arrays sort method here
            System.out.print(array[i]+ ",");
         }


    }

   
    
}
