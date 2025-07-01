package classqns1;

import java.time.LocalDateTime;

//Q7.1 Create a subclass BoxFan of Fan class you created in programming exercise 6.2. Your BoxFan has 
// •	its own private property int timing
// •	2 more methods
//  public void setTiming(int  time) //to set timing value through its parameter
//  public int getTiming( ) //to get timing variable’s value
// •	one method to override parent’s method public String toString( )
// /*print out all the properties including timing*/


//Write a Java Application class to create a BoxFan object, change its color and set timing for it. Print out its properties


public class mainFan {
    public static int timing;


    public void setTiming (int time){
        this.timing= time;

    }

    public int getTiming (int time){
        return time;
        
    }

    @Override
    public String toString() {
        return  "\n" +  
               "Time : " + timing;
               
    }

    
}

