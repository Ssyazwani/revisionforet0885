package Chap5.morexercises;

//Recalling that I did this exercise before, a small revision

import java.util.Scanner;

public class findlongestword {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your sentence");

        // String findLine = "Please stream Unnatural on Netflix";

        // System.out.println("The line is "+ findLine);

        String inputLine = sc.nextLine();

        
        String words[] = inputLine.split(" ");

        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println("The longest word is: " + longestWord);

        // String line = sc.nextLine();





        
        
    }
    
}
