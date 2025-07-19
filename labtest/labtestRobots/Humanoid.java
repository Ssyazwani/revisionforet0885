package labtest.labtestRobots;

// Task 2: Design a subclass of Robot l in Task 1 with the following requirements:

public class Humanoid extends Robot{
    //Additional properties (visibility: private )	boolean rLegsBroken
    private boolean rLegsBroken;

    //A no-arg constructor to initialize the properties in both parent and child class with valid values
    public Humanoid(){
        super(60);
        rLegsBroken = false;

    }

    //Another constructor to initialize the properties in both parent and child class through its parameters
    public Humanoid(int ageInMonth,boolean noLegsBroken){
        super(40);
        this.rLegsBroken = rLegsBroken;
    }


    //accessor method which changes the additional property’s value through its parameter with no return value
    public void setRLegsBroken(boolean rLegsBroken){
        this.rLegsBroken = rLegsBroken;
    }

    //accessor method which takes no parameter but returns the additional property’s value
    public boolean getRLegsBroken(){
        return this.rLegsBroken;
    }

   

    @Override
    public String selfIntro(){

        String walkingStatus = " ";

        String ageStatus = " ";

           if (rLegsBroken == true){
        
            walkingStatus = "can't walk";

        } else{
            walkingStatus = "Can walk slowly";

        }

         if (getAgeInMonth() > 120) {
            
            ageStatus= "too old, better retire now";

        } else {
            ageStatus = " can walk slowly";
        }


        return "The robot is " + getAgeInMonth() + " old." + " The walking status is " + walkingStatus + " Also it is " + ageStatus;
    }



  


    
}

  


    


// Task 2: Design a subclass of Robot l in Task 1 with the following requirements:

// Additional properties (visibility: private )	boolean rLegsBroken
// A no-arg constructor	    to initialize the properties in both parent and child class with valid values
// Another constructor	    to initialize the properties in both parent and child class through its parameters
// Methods



// 	    accessor method which changes the additional property’s value through its parameter with no return value
// 	    accessor method which takes no parameter but returns the additional property’s value
// 	override super class method selfIntro ( ) to return all properties’ value with additional info:
// if rLegsBroken is true, “ can’t walk” 
// else “can walk slowly”
// if ageInMonth is larger than 120, “too old, better retire now”
// else “can still work”
