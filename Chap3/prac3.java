package Chap3;
// prac3 example

import java.util.Scanner;

public class prac3 {

    public static void main(String[] args) {

        String strOUT;

        Scanner sc = new Scanner(System.in);
        int luckynum = 7;

        int x = sc.nextInt();

        if (x==luckynum){
            strOUT ="Congratulations!";
            System.out.println(strOUT);

        } else {

            strOUT ="Too bad!";
            System.out.println(strOUT);

        }


        
    }
    
}
