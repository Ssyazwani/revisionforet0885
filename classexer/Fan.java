package classexer;
//Qns6.2

public class Fan {
	
	  private double radius = 5;
	  private String color = "white";

	  public Fan(){
	  }

	  public double getRadius() {
	    return radius;//return the value of instance variable radius
	  }

	  public void setRadius(double dbRadius) {
	radius = dbRadius;
	/*change the value of instance variable to method’s parameter’s value.*/
	  }

	  public String getColor() {
		return color;
		 
	    /*add your own codes here to return the value of instance variable color*/
	  }

	  public void setColor(String strColor) {
		  this.color = strColor;
	    /*add your own codes here to change the value of instance variable color to the method’s parameter value*/
	  }

	  @Override
	    public String toString() {
		  
	        return "Your Fan" +
	                " the color is '" + color + '\'' +
	                ", the radius is " + radius ;
	    }
	/*add your own codes here to prepare and the description of the fan and return the description*/
	  
	

	public static void main(String[] args) {
		
		Fan fan = new Fan();
		System.out.println(fan.toString());
		

	}

}
