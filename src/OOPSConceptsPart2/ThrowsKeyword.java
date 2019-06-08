package OOPSConceptsPart2;

public class ThrowsKeyword {
	
	//throws keyword will just throw the exception from one method to the other its not handling the exception

	public static void main(String[] args) throws ArithmeticException{
		
		ThrowsKeyword obj = new ThrowsKeyword();
		obj.sum();
		System.out.println("ABC");
		
		

	}
	
	public void sum() {
		try {
			div();
		} catch(ArithmeticException e) {
			
		} // we can either write catch(ArithmeticException e) or catch(Error e) or catch(Throwable e) or catch(Exception e) 
		  //Throwable is the super class of error and exception class
		
		
	}
	
	public void div() throws ArithmeticException {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
		int i = 9/0;
	}

}
