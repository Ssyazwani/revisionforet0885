package Chap3;
// Q3.1 Write a Java application to allow user to guess your lucky No.  Your lucky No. is hardcoded in your program. 
//If the user keys in your lucky No, give him a congratulation message, otherwise, show him a "Thank You" message. 
// (a)	use if-else. Please refer to Lab Guide 3-1. 
// (b)	use switch 
// (c)	(optional) use shorthand if-else:     (condition)? vauleIfTrue : valueIfFalse


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
