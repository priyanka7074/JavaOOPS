package OOPSConceptsPart2;

public class ConstructorConcept {
	
	//constructor can be overloaded
	//hidden constructor is always there which is called default constructor even though it is not defined
	public ConstructorConcept() { //default constructor with zero parameter
		System.out.println("Default constructor");
		
	}
	
	public ConstructorConcept(int i) {
		System.out.println("Single paramter constructor");
		System.out.println("Value of i: "+i);
		
	}
	
	public ConstructorConcept(int i, int j) {
		System.out.println("Two paramter constructor");
		System.out.println("Value of i: "+i);
		System.out.println("Value of j: "+j);
		
	}

	public static void main(String[] args) {
		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept(10,20);
		

	}

}
