package OOPSConceptsPart2;

public class ExceptionHandling {
//	int a = 10;
//	static ExceptionHandling obj; 
	

	public static void main(String[] args) {
		
//		//uncaught exception
//		int i = 9/0;
//		System.out.println(i);
//		
//		//caught exception
//		Thread.sleep(2000);
		
		
		//System.out.println(obj.a);  //NullPointerException -- when obj =null or when the reference is not given to the new object we get this exception
		
		//1. try catch block:
		try {
			int i = 9/0;	//this code will throw Exception
		}catch(ArithmeticException e) {
			//e.printStackTrace();
			//System.out.println(e.getMessage());
			System.out.println("Hey this is / by zero error");
			
			
		}
		
		System.out.println("ABC");
		
		
	
	}

}
