//Q5.2
//Write a method that finds the average in an array of floating-point values with signature: (Please use for loop, then do while, then while loop to design it)
// public static double avgArry(double[ ] a)


// In the main method, 
// a)  Use array {1.5, 20.3, 4.5, 5.5, 10.3, 450, 20.4, -22.3} to test the method
// b)  Use another array {99, 50, 70.5} to test the method again.



public class prac5q2p1 {

    public static void main(String[] args) {

        double[] test = {1.5, 20.3, 4.5, 5.5, 10.3, 450, 20.4, -22.3};
        double [] test2 = {99, 50, 70.5};
        System.out.println("The average is " + avgArry(test));
        System.out.println("The average is " + avgArry(test2));
        
    }

    public static double avgArry(double[ ] a){

        double sum = 0;
        // for loop
        // for(int i = 0; i < a.length; i++){
        //     sum+= a[i];
        // }


        
        // for (double number:a){
        //     sum += number;

        // }


        //while loop
        // int i =0;
        // while ( i < a.length){
        //     sum+= a[i];
        //     i++;

        // }
            

        //do while loop
        int i = 0;
        do {
             sum+= a[i];
             i++;
                                }
          while (i < a.length);
        
        double avg = sum/a.length;

        return avg;
    }
}
