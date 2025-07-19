package labtest.labtestVehicle;

//labtest need 3 Java source files: superclass file, subclass file and test file with meaning file names. Include your class, adm No. and name as comments at the beginning of all your Java programs.


// Task 3: Design a testing program to: 
//   a) create two objects from subclass in Task 2 using different constructors;  
//   b) choose one of the objects created in a), print out its properties’ value with additional info by calling appropriate methods; 
//   c) call appropriate methods to change the properties’ values of the object used in b);  
//   d) display all properties’ values of object used in b) and additional info if any, again.


public class Main {
    public static void main(String[] args) {
        Car honda = new Car();
        Car toyota = new Car(7, 4);
        System.out.println("My friend just bought a car: ");
        honda.describe( );
        
        System.out.println("After 2 year, he sent his car for servicing again, now: ");
        toyota.setAge(toyota.getAge( )+2);
        toyota.setWheelNo(6);
        toyota.describe( );

        
    }
    
}
