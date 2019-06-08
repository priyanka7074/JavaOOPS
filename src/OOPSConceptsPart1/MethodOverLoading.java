package OOPSConceptsPart1;

public class MethodOverLoading {

	public static void main(String[] args) {
		MethodOverLoading obj = new MethodOverLoading();
		obj.sum();
		obj.sum(10);
		obj.sum(10, 5);

	}
	
	//you cannot create a method inside a method
	//duplicate methods --- i.e same method name with same no. of args are not allowed
	//main method can be overloaded
	//Method overloading --- when the method name is same with different arguments and different data types within the same class
	//0 i/p parameters
	public void sum() { 
		System.out.println("SUM Method --- 0 parameters");
	}
	
	//1 i/p parameter
	public void sum(int i) { 
		System.out.println("Sum Method -- 1 parameter");
		System.out.println(i);
		
	}
	
	public void sum(double i) { 
		System.out.println("Sum Method -- 1 parameter");
		System.out.println(i);
		
	}
	
	//2 i/p parameter
	public void sum(int k, int l) {  
		System.out.println("Sum Method -- 2 parameter");
		System.out.println(k+l);
	}

}
