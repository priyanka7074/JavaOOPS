package OOPSConceptsPart1;

public class FunctionsInJava {

	public static void main(String[] args) { //main method is starting point of execution
		FunctionsInJava obj = new FunctionsInJava();
		//After creating the object a copy of all non static methods will be given to this object
		obj.test();
		
		int l = obj.pqr();
		System.out.println(l);
		
		String q = obj.qa();
		System.out.println(q);
		
		int d1 = obj.division(300, 10);
		System.out.println(d1);
		
		//main method is void --- never returns a value

	}
	
	//non static methods
	//void means doesn't return any value
	public void test() {  //no i/p no o/p
		System.out.println("test method");  
	}
	
	
	//return type is int
	public int pqr() { //no i/p some o/p
		System.out.println("pqr method");
		int a = 10;
		int b = 20;
		int c = a+b;
		return c;
		
	}
	
	public String qa() {  //no i/p some o/p
		System.out.println("QA method");
		String s = "Selenium";
		return s;
	}
	
	//return type --->int
	//x and y are i/p arguments
	public int division(int x, int y) {
		System.out.println("division method");
		
		int z = x/y;
		return z;
		
	}

}
