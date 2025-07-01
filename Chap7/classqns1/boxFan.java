package classqns1;

import static classqns1.mainFan.timing;

public class boxFan extends mainFan {

   private static String color = "yellow";
   


    public void setcolor(String color){
        this.color= color;

    }

    public String getcolor(String color){
        return color;
        
    }

      @Override
    public String toString() {
        return  "\n" +  
               "Time : " + timing + "\n" +  "Color : " + color;
               
    }






    
}


