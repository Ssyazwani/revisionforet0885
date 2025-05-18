package Chap4;
public class prac4q3 {

    public static void main(String[] args) {
        System.out.println("Number " + " Square Root");
       

        for (int i = 0; i <= 20; i += 2) {
            double sqrt = Math.sqrt(i);
            System.out.print(i + "        "); System.out.print(sqrt);
            System.out.println();
        }
    }
}
