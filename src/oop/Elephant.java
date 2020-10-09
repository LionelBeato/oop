package oop;

// Elephant is a subclass of the super class Animal
public class Elephant extends Animal {
	
	private String origin;
	
//	public Elephant(String name) {
//		super(name);
//		// TODO Auto-generated constructor stub
//	}
	
	public Elephant(String name, String zoo, String origin) {
		super(name, zoo);
		this.origin = origin;
	}
	
	
	
}
