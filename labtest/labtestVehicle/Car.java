package labtest.labtestVehicle;

//labtest need 3 Java source files: superclass file, subclass file and test file with meaning file names. Include your class, adm No. and name as comments at the beginning of all your Java programs.

// Task 2: Design a subclass of Vehicle in Task 1 with the following requirements:


// 	override describe( ) in super class to print all properties’ values  and following additional info,
//     if the age < 3: “It is relatively new.”
//     else if the age is >9: “It serves too long. Please drive it carefully.”
//     else if the age is >=7: “You may consider scrapping the car.”

public class Car extends Vehicle{
    // Additional property (visibility: private )	double age
    private double age;

    // A no-arg constructor	to initialize the properties in both parent and child class with valid values
    public Car(){
        super(7);
        age = 10;
    }

    // Another constructor to initialize the properties in both parent and child class through its parameters
    public Car(double age, int wheelNo){
        super(6);
        this.age = age;

    }

    //accessor method which changes the additional property’s value through its parameter with no return value
    public void setAge(double age){
    this.age = age;
    }

    //accessor method which takes no parameter but returns the additional property’s value
    public double getAge(){
        return this.age = age;
    }

    // override describe( ) in super class to print all properties’ values  and following additional info,
    // if the age < 3: “It is relatively new.”
    // else if the age is > 9: “It serves too long. Please drive it carefully.”
    // else if the age is >=7: “You may consider scrapping the car.”

    @Override
    public void describe(){

    String ageStatus = " ";

    if(age < 3 ){
        ageStatus ="It is relatively new";
    } else if (age > 9){
        ageStatus ="It serves too long. Please drive it carefully.";
    } else if ( age >= 4 && age <= 7){
        ageStatus="You may consider scrapping the car";
    }

    System.out.println("This vehicle has " + getWheelNo() + " wheels." + "The vehicle is " + age + " old, " + ageStatus);
  }



}
