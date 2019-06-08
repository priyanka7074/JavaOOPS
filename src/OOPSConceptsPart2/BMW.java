package OOPSConceptsPart2;

public class BMW extends Car{ //Also called as "has-a-relationship"
	
	
    //When same method is present in parent class as well as in child class with the same name and same no. of args is called method overriding
	public void start() {  //overridden method is given preference
		System.out.println("BMW ---- start");
	}
	
	public void theftftSafety() {
		System.out.println("BMW ---- theftftSafety");
	}

}
