package labtest.labtestRobots;

//Create a new project with 3 Java source files: superclass file, subclass file and test file with meaning file names. Include your class, adm No. and name as comments at the beginning of all your Java programs. Zip the 3 .java files in LT2p*.zip for submission, where * is your adm No.

//Task 1: Complete the following class
//class Robot{   

public class Robot {
    //a ) declare a private instance variable ageInMonth with suitable data type
  private int ageInMonth;

  //b ) design a no-arg constructor to initialize instance variable with valid value.
  public Robot(){
    this.ageInMonth =0;
  }

  //c ) design another constructor to initialize instance variable through its parameter    
  public Robot(int ageInMonth){
    this.ageInMonth = ageInMonth;
  }

  //d ) design accessor method which changes instance variable’s value through its parameter with no return value 
  public void setAgeInMonth(int ageInMonth){
    this.ageInMonth = ageInMonth;

  }

  //e ) design accessor method which takes no parameter but returns instance variable’s value

  public int getAgeInMonth(){
    return this.ageInMonth;
  }

  //public String selfIntro( ){
   //f ) complete the method to introduce the robot
// } 
//} // end class Robot 

  public String selfIntro(){
    return "The robot is " + ageInMonth + " old.";
  }

    
}
