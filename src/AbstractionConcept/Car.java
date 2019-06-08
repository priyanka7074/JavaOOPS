package AbstractionConcept;

public interface Car {
	//only final and static variables can be defined
    int wheels=4;
	
	//always define only abstract methods they are by default abstract. No method body is defined
	//We achieve 100% abstraction
	//cannot create the object of interface
	
	public void start();
	
	public void stop();
	
	public void refuel();
	
}
