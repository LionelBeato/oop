package oop;

public class Animal implements Livable {
	
	private String name; 
	
	public void makeASound() {
		System.out.println("This animal made a sound!"); 
	}
	
	public void makeASound(String sound) {
		System.out.println("This animal said "+sound); 
	}
	
	// keep in mind this is not a method
	// it does not need a return type
	// this is your constructor
	public Animal(String name, String zoo) {
		// this refers to the class fields
		this.name = name; 
	}

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//	
	
	// this allows you to access your field
	public String getName() {
		return name;
	}
	
	// this allows you to set the value of your field
	public void setName(String name) {
		this.name = name; 
	}

	@Override
	public void beAlive() {
		System.out.println("This animal is alive"); 
	}
	

}
