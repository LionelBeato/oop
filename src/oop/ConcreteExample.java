package oop;

public class ConcreteExample extends AbstractExample implements MyInterface {

	@Override
	public void myMethod() {
	
		System.out.println("I am doing something with this method!");
		
	}

	@Override
	public void addEggs() {
		int x = 5;
		System.out.println("You added "+x+" eggs");
	}

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		
	}	
}
