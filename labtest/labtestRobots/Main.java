package labtest.labtestRobots;

//labtest need 3 Java source files: superclass file, subclass file and test file with meaning file names. Include your class, adm No. and name as comments at the beginning of all your Java programs.

// Task 3: Design a testing program to: 
// a) create two objects from subclass in Task 2 using different constructors;  
// b) choose one of the objects created in a), print out its properties’ value with additional info by calling methods; 
// c)  call related methods to change all the properties’ values of the same object in b);  
// d) display all properties’ values with additional info of object in b) again.


public class Main {

    public static void main(String[] args) {

      Humanoid howard = new Humanoid(20,true);
      Humanoid sora = new Humanoid(); 
      
      System.out.println(howard.selfIntro());
      howard.setRLegsBroken(false);
      howard.setAgeInMonth(130);
      System.out.println(sora.selfIntro());

        
    }
    
}
