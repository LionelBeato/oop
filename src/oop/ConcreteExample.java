package oop;

public class ConcreteExample extends AbstractExample {

	@Override
	public void myMethod() {
	
		System.out.println("I am doing something with this method!");
		
	}

	@Override
	public void addEggs() {
		int x = 5;
		System.out.println("You added "+x+" eggs");
	}	
}
