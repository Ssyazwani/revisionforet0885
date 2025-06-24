//Polymorphism
package oop7TestAnimalPolymorphsim;
public class TestAnimals {
  
  public static void main(String[] args) {
        Cat babe = new Cat();//Cat subclass object
	   Cow cutie =new Cow();//Cow subclass object
        Snake glass =new Snake();
	   Animal wild=new Animal();//superclass object reference
	   wild=cutie;//superclass object behaving like Cow subclass object
	   wild.talk();// so uses Cow subclass talk() method
	   wild=babe;//superclass object behaving like Cat subclass object
	   wild.talk();// so uses Cat subclass talk() method
        wild = glass;
        wild.talk();//Snake does not override talk(), Animal's talk() called
    }
}

