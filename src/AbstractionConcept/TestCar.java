package AbstractionConcept;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftSafety();
		
		
		Car c = new BMW(); //dynamic polymorphism
		c.start();
		c.stop();
		c.refuel();


	}

}
