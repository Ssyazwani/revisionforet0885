package classexer;

import java.util.Scanner;

//Q6.4    Write a Java Application which prompts user to key in any of SP core values, then check whether it is one of the SP core values or not.

	// Please try to store SP core value in a String array and use the loop which you are not very confident in.

   



public class SPcorevalues {

	public static void main(String[] args) {
		
		String[] corevalues = 
		{"Self-discipline", "Personal Integrity", "Care and Concern"," Openness", "Responsibility","Excellence" };

		System.out.println("Please enter SP's Core Values");

		Scanner value = new Scanner(System.in);

		String input = value.nextLine();

		boolean found = false;

		for (int i = 0; i < corevalues.length; i++) {
            if (input.equals(corevalues[i])) {
                found = true;
                break;
            }
        }

        if (found = true) {
            System.out.println(input + " is one of SP's core values, yes.");
        } else {
            System.out.println("That is not one of SP's core values. Run the program and try again.");
        }


		
	}
    
}


