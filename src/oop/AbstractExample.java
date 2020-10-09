package oop;

// classes in and of themselves can be abstract
// in this scenario abstract means that the implementation is not defined
public abstract class AbstractExample {
	
	// this method is concrete
	// this means it has implementation 
	// if a method has a body, it's implementation is defined
	public String concreteMethod() {
		return "hello there";
	}
	
	// this method does not need a body
	// because it is abstract
	public abstract void myMethod();
	
	public abstract void addEggs();

}
