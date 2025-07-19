package labtest.labtestVehicle;


//Create a new project with 3 Java source files: superclass file, subclass file and test file with meaning file names. Include your class, adm No. and name as comments at the beginning of all your Java programs. Zip the 3 .java files in LT2p*.zip for submission, where * is your adm No.

//Task 1: Complete the following class
class Vehicle{   
  //a ) declare a private instance variable wheelNo with suitable data type
  private int wheelNo;
    
  //b ) design a no-arg constructor to initialize instance variable with valid value. 
  public Vehicle(){
    wheelNo = 4;

  }

  //c ) design another constructor to initialize instance variable through its parameter    
  public Vehicle(int wheelNo){
    this.wheelNo = wheelNo;

  }

  //d ) design accessor method which changes instance variable’s value through its parameter with no return value 

  public void setWheelNo(int wheelNo){
    this.wheelNo = wheelNo;
  }
 
  //e ) design accessor method which takes no parameter but returns instance variable’s value

  public int getWheelNo(){
    return this.wheelNo;
  }

 //public void  describe( ) {
  /* f ) print instance variable value with proper description */
  //}

  public void describe(){
    System.out.println(" This vehicle has " + wheelNo + "wheels");
  }

} // end of class Vehicle



