package OOPSConceptsPart2;

public class TestCar {

	public static void main(String[] args) {
		
		//Polymorphism is the capability of a method to do different things based on the object 
		//that it is acting upon
		//static polymorphism -- Compile time polymorphism
		//polymorphism means one to many methods
		BMW b = new BMW();
		b.start();  //BMW ---- start
		b.stop();   //Car ---- stop
		b.refuel(); //Car ---- refuel
		b.theftftSafety();  //BMW ---- theftftSafety
		b.engine();   //Vehicle -- Engine
		
		System.out.println("***************");
		
		Car c = new Car();
		c.start();  //Car ---- start
		c.stop();  //Car ---- stop
		c.refuel(); //Car ---- refuel
		
		System.out.println("***************"); 
		
		//Top casting
		Car c1 = new BMW(); //child class object can be referred by parent class reference variable
		                    //-- dynamic polymorphism -- Runtime polymorphism
		
		c1.start(); //BMW ---- start. Preference given to overridden method
		c1.stop();  //Car ---- stop
		c1.refuel(); //Car ---- refuel
		
		//only overridden methods and parent class methods will be called using dynamic polymorphism
		
		//Down casting is not allowed 
		BMW b1 = (BMW) new Car(); //ClassCastException is thrown at runtime as Car cannot be cast to BMW
		
		
	
	}

}
