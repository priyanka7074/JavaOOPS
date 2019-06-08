package OOPSConceptsPart2;

public class B extends A{
	
	//Before entering the method B it will first go to the parent class A and execute its 
	//default constructor method and then the child class default constructor is executed
	
	//super keyword is always used to call parent class parameterized constructor 
	//if you don't use super keyword then the default  constructor is called
	//Super is always used inside the child class and it is the first statement always
	
	public B() {
		super(); 
	}
	
	public B(int i) {
		super(i); 
		
	}
	
	public B(int i, int j) {
		super(i,j); 
		
	}
	
	public static void main(String[] args) {
		B obj = new B();
		B obj1 = new B(10);
		B obj2 = new B(10,20);
		
	}

}
