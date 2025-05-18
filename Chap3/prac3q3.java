package Chap3;

// Q3.3 (a) Display all the odd numbers between 1 to 9---use if-else and for loop
//          (b) modify your code to display all the odd number between 1--99 in 10 rows, with 5 numbers on each row. ---use nested for loop
//          (c) (optional)modify your code to display times table for even No. between 1 and 9, e.g. 2*2=4 ….8*8=64 in 4 rows and 4 columns.



public class prac3q3 {

    public static void main(String[] args) {
        

        for(int i=1;i<100; i++){

            System.out.print(i + " ");

           if(i%5==0){
            System.out.println();
           }
        }
    }
    
}
