package TestPackaage;

public class Car {
	
	
	public static void start() {  //Method hiding -- the car class static method is hidden
		System.out.println("Car -- start method");
	}
	
	public void stop() {
		System.out.println("Car -- stop method");
	}
	
	public void refuel() {
		System.out.println("Car -- refuel method");
	}
	
	


}
