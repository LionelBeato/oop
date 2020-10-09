package oop;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// the main intention of OOP was to facilitate 
		// communication between pieces of code
		
		// myString is the reference to
		// the literal value "Hello!"
		String myString = "Hello!"; 
		
		// there are four principles to OOP
		// All Eagles Inherit Plumage
		// Abstraction
		// This means you are hiding away complexity
		// and exposing only the interface
		
		// when you use the new keyword
		// you are actually invoking your constructor
		Animal myAnimal = new Animal("George", "Bronx Zoo");
		myAnimal.makeASound();
		
		// Encapsulation
		// this is the concept that you put your values in 
		// "containers" and control the means of access
		
		// System.out.println(myAnimal.name);
		System.out.println(myAnimal.getName());
		Elephant otherOtherElephant = (Elephant) myAnimal; 
		
		
		// Inheritance
		// the idea that methods and properties can be passed down
		// to subclasses
		// a child can do everything the parent can plus more
		// you can only inherit from one class directly
		// however, the inheritance chain can go on indefinitely
		// all classes inherit from the class Object
		Elephant myElephant = new Elephant("Jimbo", "Bronx Zoo", "African"); 
		System.out.println(myElephant.getName());
		
		Object myObject = new Object(); 
		
		// Polymorphism
		// Data can operate like other pieces of data
		// this describes the ability to process data 
		// differently depending on their types of inputs
		
		Object myOtherElephant = new Elephant("Bumbo", "Bronx Zoo", "Asian"); 
		// the code below is not valid
		// because we declared this elephant as an object we dont have access to
		// the appropriate functionalities
		//System.out.println(myOtherElephant.getName());
		
		// the code below is not valid either
//		Elephant yetAnotherElephant = new Object(); 
		
		Finch myFinch = new Finch(); 
		
		// even though Finch did not explicit implement Flyable
		// we have access to it due to the parent-child relationship
		// between Finch and Bird
		myFinch.doFly();
		
		
		
	
	}

}
