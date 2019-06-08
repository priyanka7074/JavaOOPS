package OOPSConceptsPart2;

public class FinallyConcept {

	public static void main(String[] args) {
		//t1();
		//t2();
		div();
		

	}
	
	public static void t1() {
		try {
			System.out.println("Inside t1 method");
			throw new RuntimeException("test");
		}catch(Exception e) {
			System.out.println("Inside catch block");
		}
		
		//whatever code is written in the try catch will be executed and then the finally block 
		//is also executed. Doesn't matter if the exception is coming or not
		finally
		{
			System.out.println("Inside finally block");
		}
	
		
	}
	
	public static void t2() {
		try {
			System.out.println("Inside t2 method");
		}
		finally {
			System.out.println("Finally code in t2 method");
		}
	}
	
	public static void div() {
		int i=10;
		try {
			System.out.println("Inside try block");
			int k=i/0;
		}catch(NullPointerException e) {
			System.out.println("Inside catch block");
			System.out.println("Divide by zero error");
		}
		finally {
			System.out.println("Execute this code even after any exception");
		}
		
	}

}
