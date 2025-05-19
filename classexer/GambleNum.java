package classexer;

//Q6.1   Design a class called Die. The Die class has a data field numFaces whose value is 6, a method roll which does not require parameter but randomly generates and returns an integer from 1 to numFaces.

//Write a GambleNum class with a main method. Inside the main method, create a Die object, call its roll method to get a random number and print it out.

class Die {
    int numFaces;

    public Die(int faces) {
        this.numFaces = faces;
    }

    public int roll(){
        return (int)(Math.random() * numFaces) + 1;
    }
}


public class GambleNum {

    public static void main(String[] args) {
        Die num1 = new Die(6);
       
        System.out.println("You have rolled " + num1.roll());
    }
    
}
