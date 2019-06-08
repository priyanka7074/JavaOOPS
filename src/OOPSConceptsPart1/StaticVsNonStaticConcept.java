package OOPSConceptsPart1;

public class StaticVsNonStaticConcept {
	//global vars: the scope of global vars will be available across all the functions with some conditions
	String name = "Tom";  // Non static global variable
	static int age = 25;  // static global variable
	

	public static void main(String[] args) {
		//calling static methods and variables
		
		//1. direct calling
		sum();
		
		//2. calling by classname
		StaticVsNonStaticConcept.sum();
		
		//Calling static variables
		//1.
		System.out.println(age);
		
		//2.
		System.out.println(StaticVsNonStaticConcept.age);
		
		//For calling non static
		StaticVsNonStaticConcept obj = new StaticVsNonStaticConcept();
		obj.sendMail();
		System.out.println(obj.name);
		
		//can I access static methods by using obj reference. Yes u can access but not a good practice
		obj.sum(); //warning will be given

	}
	
	// Non static method
	public void sendMail() {
		System.out.println("send mail method");
	}
	
	//Static Method
	public static void sum() {
		System.out.println("sum method");
	}

}
